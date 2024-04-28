package com.amazon.ata.linkedlists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

import com.amazon.ata.string.TextTable;
import com.google.common.collect.ImmutableList;

/**
 * PARTICIPANTS: You should not need to edit this class. Feel free to poke around if interested.
 */
public class ListProfiler {
    private static final int MINIMUM_ITERATIONS = 100;
    private static final List<Integer> DATA_SIZES = ImmutableList.of(100, 10000, 1000000);
    private final List<ProfileableList> listsToProfile = new ArrayList<>();

    private int iterations = MINIMUM_ITERATIONS;

    public ListProfiler() { }

    /**
     * Creates a new ListProfiler that repeats the profiled operations for
     * the specified amount of iterations and averages the time taken.
     *
     * @param iterations the number of iterations to run each operation
     */
    public ListProfiler(int iterations) {
        if (iterations > MINIMUM_ITERATIONS) {
            this.iterations = iterations;
        }
    }

    public ListProfiler withListToProfile(ProfileableList listToProfile) {
        this.listsToProfile.add(listToProfile);
        return this;
    }

    /**
     * Runs the add and get operations of the ProfileableLists
     * set in this ListProfiler. Will profile each list using
     * an increasing amount of random data.
     */
    public void profileLists() {
        List<ProfileResult> profileResults = new ArrayList<>();
        for (ProfileableList profileableList : listsToProfile) {
            for (Integer dataSize : DATA_SIZES) {
                List<Double> data = new ArrayList<>();
                for (int i = 0; i < dataSize; i++) {
                    data.add(Math.random() * 1000);
                }

                profileResults.add(profileListWithDataSize(profileableList, data));
            }
        }

        renderResults(profileResults);
    }

    /**
     * Run various methods exposed on the ProfileableList interface, measuring the time taken to execute the ones
     * we are interested in. Will first add some amount of data to the list
     *
     * @param listToProfile the list to profile
     * @param dataToAdd the Collection of data to add
     * @return the ProfileResult recording the average time each operation takes
     */
    private ProfileResult profileListWithDataSize(ProfileableList listToProfile, Collection<Double> dataToAdd) {
        ProfileResult profileResult = new ProfileResult();
        profileResult.setDataSize(dataToAdd.size());
        profileResult.setListType(listToProfile.getListImplementationType());

        // clear any previous data
        listToProfile.clear();
        // add the new data set
        listToProfile.addAll(dataToAdd);

        String getFirstTime = profileOperation(listToProfile::getFirst);
        String getLastTime = profileOperation(listToProfile::getMiddle);

        String addFirstTime = profileOperation(() -> listToProfile.addFirst(Math.random() * 1000));
        String addToBackTime = profileOperation(() -> listToProfile.addLast(Math.random() * 1000));

        profileResult.setAddLastTime(addToBackTime);
        profileResult.setAddFirstTime(addFirstTime);
        profileResult.setGetFirstTime(getFirstTime);
        profileResult.setGetIndexTime(getLastTime);

        return profileResult;
    }

    private String profileOperation(Runnable runnable) {
        long startTime = System.nanoTime();
        for (int i = 0; i < this.iterations; i++) {
            try {
                runnable.run();
            } catch (UnsupportedOperationException e) {
                return "Not implemented yet, N/A";
            }

        }
        long endTime = System.nanoTime();

        return Double.toString((endTime - startTime) / (double) this.iterations);
    }

    private String profileOperation(Supplier<Double> supplier) {
        long startTime = System.nanoTime();
        for (int i = 0; i < this.iterations; i++) {
            try {
                supplier.get();
            } catch (UnsupportedOperationException e) {
                return "Not implemented yet, N/A";
            }

        }
        long endTime = System.nanoTime();

        return Double.toString((endTime - startTime) / (double) this.iterations);
    }

    private void renderResults(List<ProfileResult> results) {
        System.out.println(String.format("Showing average of %s iterations.", iterations));

        List<String> headers = ImmutableList.of("List Size",
            "Profileable List Type",
            "Add to Front Time (ns)",
            "Add to Back Time (ns)",
            "Get First Time (ns)",
            "Get Middle Time (ns)");

        List<List<String>> strings = new ArrayList<>();

        for (ProfileResult profileResult : results) {
            strings.add(ImmutableList.of(
                profileResult.getDataSize(),
                profileResult.getListType(),
                profileResult.getAddFirstTime(),
                profileResult.getAddLastTime(),
                profileResult.getGetFirstTime(),
                profileResult.getGetIndexTime()));
        }

        String renderedResults = new TextTable(headers, strings).toString();

        System.out.println(renderedResults);
    }
}

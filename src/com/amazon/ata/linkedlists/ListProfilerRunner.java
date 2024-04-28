package com.amazon.ata.linkedlists;

public class ListProfilerRunner {
    public static void main(String[] args) {
        ListProfiler listProfiler = new ListProfiler();

        listProfiler.withListToProfile(new ProfileableArrayList());
        listProfiler.withListToProfile(new ProfileableLinkedList());

        listProfiler.profileLists();
    }
}

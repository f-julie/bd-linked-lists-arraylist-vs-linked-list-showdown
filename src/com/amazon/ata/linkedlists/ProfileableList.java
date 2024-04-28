package com.amazon.ata.linkedlists;

import java.util.Collection;

/**
 * An interface exposing list methods that we are interested
 * in profiling. Implementation classes should use a backing
 * List type to implement these methods.
 */
public interface ProfileableList {
    /**
     * The underlying list implementation.
     * @return a string of the list implementation's name.
     */
    String getListImplementationType();

    /**
     * Add data to the front of the list.
     * @param data the data to add.
     */
    void addFirst(Double data);

    /**
     * Add data to the back of the list.
     * @param data the data to add.
     */
    void addLast(Double data);

    /**
     * Get the first element of the list.
     * @return the first element of the list.
     */
    Double getFirst();

    /**
     * Get the middle element of the list.
     * @return the middle element of the list.
     */
    Double getMiddle();

    /**
     * Clears all data from the list.
     */
    void clear();

    /**
     * Adds the entire collection of data to the list.
     * @param collection the collection of data.
     */
    void addAll(Collection<Double> collection);
}

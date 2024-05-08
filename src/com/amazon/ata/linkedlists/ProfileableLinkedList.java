package com.amazon.ata.linkedlists;

import java.util.Collection;
import java.util.LinkedList;

/**
 * A ProfileableList implementation using a LinkedList.
 *
 * PARTICIPANTS: Implement all methods that throw UnsupportedOperationException in any order.
 */
public class ProfileableLinkedList implements ProfileableList {
    // Default in java is a double linked list
    private LinkedList<Double> list = new LinkedList<>(); // Data type double can be for double or single linked list

    @Override
    public String getListImplementationType() {
        return "LinkedList";
    }

    @Override
    public void addFirst(Double data) {
        list.add(0, data);
        // Another option
        //list.addFirst(data);
        //throw new UnsupportedOperationException();
    }

    @Override
    public void addLast(Double data) {
        list.add(data);
        //throw new UnsupportedOperationException();
    }

    @Override
    public Double getFirst() {
        return list.get(0);
        //throw new UnsupportedOperationException();
    }

    @Override
    public Double getMiddle() {
        int middle = list.size() / 2;
        return list.get(middle);
        //throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void addAll(Collection<Double> collection) {
        this.list.addAll(collection);
        //throw new UnsupportedOperationException();
    }
}

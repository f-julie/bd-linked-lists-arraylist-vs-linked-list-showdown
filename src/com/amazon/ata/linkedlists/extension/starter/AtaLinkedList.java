package com.amazon.ata.linkedlists.extension.starter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.amazon.ata.linkedlists.ProfileableList;

/**
 * PARTICIPANTS: This is a partial implementation of the AtaLinkedList.
 *
 * Feel free to continue building off of this or use it as a guide for your
 * own implementation.
 */
public class AtaLinkedList implements ProfileableList {
    private AtaNode head;
    private AtaNode tail;
    private int size;

    public AtaLinkedList() {
        this.size = 0;
    }

    public AtaLinkedList(Double data) {
        this.head = new AtaNode(data, null);
        this.tail = head;
        this.size = 1;
    }

    @Override
    public String getListImplementationType() {
        return "AtaLinkedList";
    }

    @Override
    public void addFirst(final Double data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addLast(final Double data) {
        AtaNode ataNode = new AtaNode(data, null);

        if (this.head == null) {
            this.head = ataNode;
            this.tail = head;
        } else {
            this.tail.setNext(ataNode);
            this.tail = this.tail.getNext();
        }
        this.size++;
    }

    @Override
    public Double getFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Double getMiddle() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addAll(final Collection<Double> collection) {
        for (Double data : collection) {
            addLast(data);
        }
    }

    public int size() {
        return this.size;
    }

    public List<AtaNode> getAll() {
        List<AtaNode> ataNodes = new ArrayList<>();
        AtaNode pointer = head;
        do {
            ataNodes.add(pointer);
            pointer = pointer.getNext();
        } while (pointer != null);

        return ataNodes;
    }
}

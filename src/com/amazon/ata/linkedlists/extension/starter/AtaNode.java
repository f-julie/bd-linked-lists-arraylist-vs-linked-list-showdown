package com.amazon.ata.linkedlists.extension.starter;

/**
 * PARTICIPANTS: Feel free to use Node class directly or as a guide
 * for your own implementation.
 */
public class AtaNode {
    private Double data;
    private AtaNode next;

    public AtaNode(final Double data, final AtaNode next) {
        this.data = data;
        this.next = next;
    }

    public Double getData() {
        return data;
    }

    public void setData(final Double data) {
        this.data = data;
    }

    public AtaNode getNext() {
        return next;
    }

    public void setNext(final AtaNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + '}';
    }
}

package com.amazon.ata.linkedlists;

import java.util.ArrayList;
import java.util.Collection;

public class ProfileableArrayList implements ProfileableList {
    private ArrayList<Double> list = new ArrayList<>();

    @Override
    public String getListImplementationType() {
        return "ArrayList";
    }

    @Override
    public void addFirst(Double data) {
        this.list.add(0, data);
    }

    @Override
    public void addLast(Double data) {
        this.list.add(data);
    }

    @Override
    public Double getFirst() {
        return this.list.get(0);
    }

    @Override
    public Double getMiddle() {
        return this.list.get(list.size() / 2);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void addAll(Collection<Double> collection) {
        this.list.addAll(collection);
    }
}

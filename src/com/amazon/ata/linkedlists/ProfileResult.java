package com.amazon.ata.linkedlists;

public class ProfileResult {
    private String listType;
    private String dataSize;
    private String addFirstTime;
    private String addLastTime;
    private String getFirstTime;
    private String getIndexTime;

    public String getListType() {
        return listType;
    }

    public void setListType(final String listType) {
        this.listType = listType;
    }

    public void setDataSize(Integer dataSize) {
        this.dataSize = dataSize.toString();
    }

    public String getDataSize() {
        return this.dataSize;
    }

    public String getAddFirstTime() {
        return addFirstTime;
    }

    public void setAddFirstTime(final String addFirstTime) {
        this.addFirstTime = addFirstTime;
    }

    public String getAddLastTime() {
        return addLastTime;
    }

    public void setAddLastTime(final String addLastTime) {
        this.addLastTime = addLastTime;
    }

    public String getGetFirstTime() {
        return getFirstTime;
    }

    public void setGetFirstTime(final String getFirstTime) {
        this.getFirstTime = getFirstTime;
    }

    public String getGetIndexTime() {
        return getIndexTime;
    }

    public void setGetIndexTime(final String getIndexTime) {
        this.getIndexTime = getIndexTime;
    }
}

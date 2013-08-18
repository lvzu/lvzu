package com.lvzu.common;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {

    public static final String KEY = "page";

    private static final long TOTAL_COUNT_UNKNOW = -1L;

    protected int pageNo = 1;
    protected int pageSize = -1;
    protected boolean autoCount = true;
    protected List<String> orderList = new ArrayList<String>();
    protected List<String> ascOrderList = new ArrayList<String>();
    protected List<String> descOrderList = new ArrayList<String>();

    protected List<T> results = new ArrayList<T>();
    protected long totalPages = -1L;

    public Page() {
    }

    public Page(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public Page<T> setPageNo(int pageNo) {
        this.pageNo = pageNo;
        if (pageNo < 1) {
            this.pageNo = 1;
        }
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Page<T> setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getFirst() {
        return ((pageNo - 1) * pageSize) + 1;
    }

    public boolean isAutoCount() {
        return autoCount && totalPages == TOTAL_COUNT_UNKNOW;
    }

    public Page<T> setAutoCount(boolean autoCount) {
        this.autoCount = autoCount;
        return this;
    }

    public List<T> getResults() {
        return results;
    }

    public Page<T> setResults(List<T> results) {
        this.results = results;
        return this;
    }

    public long getTotalCount() {
        return totalPages;
    }

    public Page<T> setTotalCount(long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public long getTotalPages() {
        if (totalPages < 0) {
            return -1L;
        }

        long count = totalPages / pageSize;
        if (totalPages % pageSize > 0) {
            count++;
        }
        return count;
    }

    public boolean isHasNext() {
        return (pageNo + 1 <= getTotalPages());
    }

    public int getNextPage() {
        if (isHasNext()) {
            return pageNo + 1;
        } else {
            return pageNo;
        }
    }

    public boolean isHasPre() {
        return (pageNo - 1 >= 1);
    }

    public int getPrePage() {
        if (isHasPre()) {
            return pageNo - 1;
        } else {
            return pageNo;
        }
    }

    //
    public List<String> getOrderList() {
        return orderList;
    }

    public List<String> getAscOrderList() {
        return ascOrderList;
    }

    public List<String> getDescOrderList() {
        return descOrderList;
    }

    public Page<T> asc(String column) {
        orderList.add(column + " ASC");
        ascOrderList.add(column);
        return this;
    }

    public Page<T> desc(String column) {
        orderList.add(column + " DESC");
        descOrderList.add(column);
        return this;
    }

}

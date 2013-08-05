package com.lvzu.core.util;

import java.text.MessageFormat;

/**
 * User: lianghongbin
 * Date: 7/16/13
 * Time: 14:50
 * Description:
 */
public class Pagination {

    private int currentPage = 1;// 当前页
    private int pageSize = 15;  // 每页显示条数
    private long totalRows;      // 总记录数
    private String url;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        float result = (float) totalRows / pageSize;
        int intResult = (int) result;
        if (result > intResult) {
            return intResult + 1;
        }

        return intResult;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(long totalRows) {
        this.totalRows = totalRows;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPreviousPage() {
        if (currentPage > 1) {
            return currentPage - 1;
        }

        return 0;
    }

    public int getNextPage() {
        if (getTotalPages() > currentPage) {
            return currentPage + 1;
        }

        return 0;
    }

    private String urlFormat(int pageNum) {
        return MessageFormat.format(url, pageNum);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("共 ").append(getTotalPages()).append(" 页&nbsp;&nbsp;");
        buffer.append("当前第 ").append(getCurrentPage()).append(" 页&nbsp;&nbsp;");
        if (getTotalPages() > 1 && currentPage > 1) {
            buffer.append("<a href=\"");
            buffer.append(urlFormat(1));
            buffer.append("\">首页</a>");
        } else {
            buffer.append("&nbsp;&nbsp;首页");
        }

        if (currentPage > 1) {
            buffer.append("&nbsp;&nbsp;<a href=\"");
            buffer.append(urlFormat(currentPage - 1));
            buffer.append("\">前一页</a>");
        } else {
            buffer.append("&nbsp;&nbsp;前一页");
        }

        if (currentPage < getTotalPages()) {
            buffer.append("&nbsp;&nbsp;<a href=\"");
            buffer.append(urlFormat(currentPage + 1));
            buffer.append("\">后一页</a>");
        } else {
            buffer.append("&nbsp;&nbsp;后一页");
        }

        if (getTotalPages() > 1 && currentPage < getTotalPages()) {
            buffer.append("&nbsp;&nbsp;<a href=\"");
            buffer.append(urlFormat(getTotalPages()));
            buffer.append("\">末页</a>");
        } else {
            buffer.append("&nbsp;&nbsp;末页");
        }

        return buffer.toString();
    }
}

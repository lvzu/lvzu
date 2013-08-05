package com.lvzu.core.util;

import org.apache.ibatis.session.RowBounds;

/**
 * User: lianghongbin
 * Date: 7/16/13
 * Time: 15:20
 * Description:
 */
public class RowBoundsUtil {

    public static RowBounds generate(Pagination pagination) {
        int offset = (pagination.getCurrentPage()-1) * pagination.getPageSize();
        return new RowBounds(offset, pagination.getPageSize());
    }
}

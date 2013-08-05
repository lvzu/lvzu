package com.lvzu.test.service;

import com.lvzu.core.entity.User;
import com.lvzu.core.service.UserService;
import com.lvzu.core.util.Pagination;
import com.lvzu.core.util.RowBoundsUtil;
import com.lvzu.test.BaseTestCase;
import junit.framework.Assert;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午4:33
 * Description:
 */
public class UserServiceTest extends BaseTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll() {
        Pagination pagination = new Pagination();
        pagination.setPageSize(5);
        pagination.setCurrentPage(1);
        pagination.setTotalRows(userService.findCount(null));

        RowBounds rowBounds = RowBoundsUtil.generate(pagination);
        List<User> users = userService.findAll(rowBounds);

        for (User user : users) {
            System.out.print(user.getId());
            System.out.print(" - ");
            System.out.println(user.getUsername());
        }

        Assert.assertTrue(true);
    }
}

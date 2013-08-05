package com.lvzu.web.controller;

import com.lvzu.core.entity.User;
import com.lvzu.core.service.UserService;
import com.lvzu.core.util.Pagination;
import com.lvzu.core.util.RowBoundsUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午7:25
 * Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user.htm", method = RequestMethod.GET)
    public ModelAndView list(@RequestParam(required = false) Integer p) {

        int page = p == null ? 1 : p;
        Pagination pagination = new Pagination();
        pagination.setCurrentPage(page);
        pagination.setPageSize(5);
        pagination.setTotalRows(userService.findCount(null));
        pagination.setUrl("/user.htm?p={0}");
        RowBounds rowBounds = RowBoundsUtil.generate(pagination);

        List<User> users = userService.findAll(rowBounds);
        ModelAndView model = new ModelAndView("user");
        model.addObject("users", users);
        model.addObject("pagination", pagination);

        return model;
    }

    @RequestMapping(value = "/list.htm", method = RequestMethod.GET)
    public ModelAndView listCondition(@RequestParam(required = false) Integer p) {
        int page = p == null ? 1 : p;
        Pagination pagination = new Pagination();
        pagination.setCurrentPage(page);
        pagination.setPageSize(5);
        Map<String, Object> condition = new HashMap<String, Object>(1);
        condition.put("id", 6);
        pagination.setTotalRows(userService.findCount(condition));
        pagination.setUrl("/list.htm?p={0}");
        RowBounds rowBounds = RowBoundsUtil.generate(pagination);

        List<User> users = userService.findByCondition(condition, rowBounds);
        ModelAndView model = new ModelAndView("user");
        model.addObject("users", users);
        model.addObject("pagination", pagination);

        return model;
    }
}
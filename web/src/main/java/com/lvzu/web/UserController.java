package com.lvzu.web;

import com.lvzu.common.Page;
import com.lvzu.model.User;
import com.lvzu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * User: Administrator
 * Date: 13-8-17
 * Time: 下午11:56
 * Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user.htm", method = RequestMethod.GET)
    public ModelAndView list(@RequestParam(required = false) Integer p) {

        p = p == null ? 1 : p;

        Page<User> page = new Page<User>(5);
        page.setPageNo(p);
        Page<User> userPage = userService.findAll(page);

        ModelAndView modelAndView = new ModelAndView("user", "page", userPage);

        return modelAndView;
    }
}

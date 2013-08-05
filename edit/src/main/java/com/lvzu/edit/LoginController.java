package com.lvzu.edit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午10:04
 * Description:
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login.htm", method = RequestMethod.GET)
    public ModelAndView view() {
        return new ModelAndView("login");
    }
}

package com.lvzu.api.controller;

import com.google.gson.Gson;
import com.lvzu.api.facade.UserFacade;
import com.lvzu.core.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午10:12
 * Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserFacade userFacade;

    @RequestMapping(value = "/user.htm", method = RequestMethod.GET)
    @ResponseBody
    public String user(@RequestParam long id) throws Exception{
        User user = userFacade.find(id);

        Gson gson = new Gson();
        String json = gson.toJson(user);
        throw new Exception("error");
    }
}

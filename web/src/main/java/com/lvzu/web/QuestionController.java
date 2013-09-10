package com.lvzu.web;

import com.lvzu.common.Page;
import com.lvzu.model.Question;
import com.lvzu.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: robort
 * Date: 13-9-10
 * Time: 下午10:06
 * Description:
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService qService;

    @RequestMapping(value = "/question.htm", method = RequestMethod.GET)
    public ModelAndView list(@RequestParam(required = false) Integer p) {

        p = p == null ? 1 : p;

        Page<Question> page = new Page<Question>(5);
        page.setPageNo(p);
        Page<Question> questionPage = qService.findAll(page);

        ModelAndView modelAndView = new ModelAndView("question", "page", questionPage);

        return modelAndView;
    }
}

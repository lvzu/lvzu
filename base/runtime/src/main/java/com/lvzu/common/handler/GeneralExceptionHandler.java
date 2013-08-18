package com.lvzu.common.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午10:46
 * Description: 统一异常处理类
 */
public class GeneralExceptionHandler implements HandlerExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(GeneralExceptionHandler.class);

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o, Exception e) {

        logger.error("Catch a exception from {}", o);
        logger.error("Exception:{}", e.getMessage());

        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType("application/json; charset=utf-8");

        try {
            PrintWriter writer = httpServletResponse.getWriter();
            writer.print("{status:error}"); //输出标准错误json信息
        } catch (IOException ignored) {
        }

        return new ModelAndView();
    }
}

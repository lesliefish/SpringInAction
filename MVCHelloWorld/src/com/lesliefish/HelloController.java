package com.lesliefish;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

    private static Log logger = LogFactory.getLog(HelloController.class);

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        logger.info("handleRequest is called");

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "hello world");
        mv.setViewName("/WEB-INF/content/welcome.jsp");

        return mv;
    }
}

package com.lesliefish.staticpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticPageController {
    @RequestMapping(value = "/staticIndex", method = RequestMethod.GET)
    public String index(){
        return "staticPageIndex";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/pages/final.htm";
    }
}

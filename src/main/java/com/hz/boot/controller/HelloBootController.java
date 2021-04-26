package com.hz.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zsy
 * @date 2021/4/23 - 14:28
 */
@Controller
public class HelloBootController {
    @RequestMapping("/helloBoot")
    public String helloBoot() {
        System.out.println("==========");
        return "index.jsp";
    }
}

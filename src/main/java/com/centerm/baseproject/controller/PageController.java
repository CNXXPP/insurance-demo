package com.centerm.baseproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Show")
public class PageController {
    @RequestMapping
    public String index(){
        return "public/index";
    }
}

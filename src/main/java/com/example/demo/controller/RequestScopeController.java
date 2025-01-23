package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("request-scope")
public class RequestScopeController {
    @RequestMapping("")
    public String hogehoge(){
        return "request-scope-form";
    }
    @RequestMapping("input")
    public String hugahuga(String name,Model model){
        model.addAttribute("hogehoge",name);
        return "result-request-scope";

    }

}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveForm;


@Controller
@RequestMapping("/receive")
public class ReceiveController {
    @RequestMapping("")

    public String index() {
        return "info-form";
    }
    @RequestMapping("/receive-info")
    public String receiveInfo(String name,String age){
        // System.out.println("入力された名前は"+name+"です");
        // System.out.println("入力された年齢は"+age+"です");
        System.out.println(ReceiveForm.getName);
        System.out.println(ReceiveForm.getAge);
        return "finished";
    }

}


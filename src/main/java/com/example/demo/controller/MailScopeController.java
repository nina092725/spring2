package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/mail-scope")
public class MailScopeController {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String index(){
        return "mail-scope-form";
    }

    @RequestMapping("/input-mail")
    public String inputMail(String mail,String pass, Model model, HttpSession session) {

        session.setAttribute("mail",mail);
        session.setAttribute("pass", pass);

        if (mail.equals("test@example.com")&& pass.equals("123")) {
            return "mail-result-session-scope1.html";
        } else {
            model.addAttribute("error", "メールアドレスが不正です");
            return "mail-scope-form.html";
        }

    
    }    
    @RequestMapping("/to-myPage")
    public String toMypage(){
        return "mail-result-session-scope2";
    }


}

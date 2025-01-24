package com.example.demo.controller;

import org.springframework.stereotype.
Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.
annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



// @Controller
// @RequestMapping("/name")
// public class NameController {
//      @RequestMapping("")

//     public String higehige() {
//         return "name-form";
//     }
   


// @RequestMapping("/input-name")
// public String inputName(@RequestParam(value = "newName", required = false) String newName,
//                         @RequestParam(value = "newName2", required = false) String newName2,
//                         Model model) {
//     int num1 = 0;
//     int num2 = 0;
//     if (newName != null && !newName.isEmpty()) {
//         num1 = Integer.parseInt(newName);
//     }
//     if (newName2 != null && !newName2.isEmpty()) {
//         num2 = Integer.parseInt(newName2);
//     }
//     int result = num1 + num2;
//     model.addAttribute("result", result);
//     return "result-name-scope";
// }

@Controller
@RequestMapping("/name")
public class NameController {

    @GetMapping("/input-name")
    public String inputName(
            @RequestParam(value = "newName", required = false) String newName,
            @RequestParam(value = "newName2", required = false) String newName2,
            Model model) {
        // int num1 = StringUtils.isEmpty(newName) ? 0 : Integer.parseInt(newName);
        // int num2 = StringUtils.isEmpty(newName2) ? 0 : Integer.parseInt(newName2);
        // int result = num1 + num2;
        // model.addAttribute("result", result);
        return "result-name-scope";
    }
    
}



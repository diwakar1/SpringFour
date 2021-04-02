package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("result","this is the text for model");
        return "index";
    }

    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }

    @RequestMapping("/processform")
    public String loadProcessFormpage(@RequestParam("login") String login,
                                       Model model){
        model.addAttribute("loginval",login);
        return "confirm";
    }
}

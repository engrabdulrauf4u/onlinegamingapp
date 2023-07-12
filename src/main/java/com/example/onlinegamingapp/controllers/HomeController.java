package com.example.onlinegamingapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView navigateToHomePage() {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }


    @RequestMapping("/loginprocess")
    public ModelAndView loginprocess(@RequestParam String username, @RequestParam String password, Model model) {

        model.addAttribute("username",username);

        ModelAndView mv = new ModelAndView("success");

        return mv;
    }

    @RequestMapping("/success")
    public ModelAndView success() {
        ModelAndView mv = new ModelAndView("success.jsp");
        return mv;
    }


}

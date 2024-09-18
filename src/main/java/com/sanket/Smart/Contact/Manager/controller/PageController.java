package com.sanket.Smart.Contact.Manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {
        @RequestMapping("/home")
        public String homePage(Model model){
            model.addAttribute("name","text from the model");
            model.addAttribute("name1","text from the model 1");
            model.addAttribute("name2","text from the model 2");

            return "home";
        }
        @RequestMapping("/about")
        public String aboutPage(Model model){
            model.addAttribute("name","text from the model");
            model.addAttribute("name1","text from the model 1");
            model.addAttribute("name2","text from the model 2");

            return "about";
        }
        @RequestMapping("/services")
        public String servicesPageLoading(Model model){
            model.addAttribute("name","text from the model");
            model.addAttribute("name1","text from the model 1");
            model.addAttribute("name2","text from the model 2");

            return "services";
        }
}

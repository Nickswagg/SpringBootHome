package com.example.home.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "Hello I'm Nick and i am learning SpringBoot";
    }

    @RequestMapping("/home")
    public String home(){
        return "index.html";
    }
    
    @RequestMapping("/forms")
    public String form(){
        return "forms.html";
    }

    @RequestMapping("/page")
    public String other(){
        return "page.html";
    }
    
}
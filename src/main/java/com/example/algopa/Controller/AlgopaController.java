package com.example.algopa.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlgopaController {
<<<<<<< HEAD
    @GetMapping("my_study_submit")
    public String my_study_copy(){
        return "my_study_submit";
=======
    @GetMapping("/my_study_copy")
    public String my_study_copy(){
        return "my_study";
>>>>>>> c87b0075d113a706733096923b65fb2e26667246
    }
    @GetMapping("/my_study")
    public String my_study(){
        return "my_study";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }
}

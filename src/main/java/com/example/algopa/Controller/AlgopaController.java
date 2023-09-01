package com.example.algopa.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlgopaController {
    @GetMapping("my_study_copy")
    public String my_study_copy(Model model){
//        model.addAttribute("data","hello");
        return "my_study_copy";
    }
    @GetMapping("my_study")
    public String my_study(Model model){
//        model.addAttribute("data","hello");
        return "my_study";
    }

}

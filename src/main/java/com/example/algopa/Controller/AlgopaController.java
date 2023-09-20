package com.example.algopa.Controller;


import com.example.algopa.DTO.LoginDTO;
import com.example.algopa.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlgopaController {

    LoginService loginService;
    @Autowired
    public AlgopaController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("my_study_submit")
    public String my_study_submit(){
        return "my_study_submit";}

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
    @GetMapping("/signup")
    public String signup() { return "signup"; }
    @PostMapping("/signup")
    public String signup_success(@ModelAttribute LoginDTO loginDTO) {
        // 사용자 정보를 데이터베이스에 저장
        loginService.saveUser(loginDTO);
        // 로그인 페이지로 리다이렉트
        return "redirect:/login";
    }
}

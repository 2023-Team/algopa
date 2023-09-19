package com.example.algopa.Controller;

import com.example.algopa.DTO.MemberDTO;
import com.example.algopa.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService; //생성자 주입으로 의존성 주입
    @GetMapping("/save")
    public String saveForm() { return "save"; }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "index";
    }
}

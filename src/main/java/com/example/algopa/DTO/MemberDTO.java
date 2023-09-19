package com.example.algopa.DTO;


import lombok.*;

//리플렉션으로 자동으로 생성자 생성해줌
@Getter
@Setter
@ToString
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
public class MemberDTO {
    private Integer member_id;
    private String login_id;
    private String username;
    private String password;
    private String email;
    private String role;
}

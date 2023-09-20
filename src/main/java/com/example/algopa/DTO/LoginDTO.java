package com.example.algopa.DTO;

import com.example.algopa.Entity.LoginEntity;
import lombok.Builder;
import lombok.Data;

@Data
public class LoginDTO {

    private String login_id;
    private String password;

    @Builder
    public LoginDTO(String login_id, String password) {
        this.login_id = login_id;
        this.password = password;
    }

    public LoginEntity toEntity() {
        return LoginEntity.builder()
                .login_id(login_id)
                .password(password)
                .build();
    }
}
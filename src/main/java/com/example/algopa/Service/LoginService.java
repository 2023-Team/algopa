package com.example.algopa.Service;

import com.example.algopa.DTO.LoginDTO;
import com.example.algopa.Entity.LoginEntity;
import com.example.algopa.Repository.LoginRepository;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {

    private LoginRepository loginRepository;

    public LoginEntity saveUser(LoginDTO loginDTO) {
        return loginRepository.save(loginDTO.toEntity());
    }

}
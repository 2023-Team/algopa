package com.example.algopa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class LoginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer key_id;

    private String login_id;

    private String password;

    private String name;
    private Long student_num;
    private String email;
    @Builder
    public LoginEntity(
            String login_id,
            String password) {
        this.login_id = login_id;
        this.password = password;
    }
}

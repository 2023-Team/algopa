package com.example.algopa.Entity;

import com.example.algopa.DTO.MemberDTO;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "member_table")
public class MemberEntity {

    @Id //pk, 필수 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    @Column(unique = true)
    private Integer member_id;

    @Column
    private String login_id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String role;

    //DTO -> Entity 로 담아 return
    public static MemberEntity toSaveEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMember_id(memberDTO.getMember_id());
        memberEntity.setLogin_id(memberDTO.getLogin_id());
        memberEntity.setUsername(memberDTO.getUsername());
        memberEntity.setPassword(memberDTO.getPassword());
        memberEntity.setEmail(memberDTO.getEmail());
        memberEntity.setRole(memberDTO.getRole());
        return memberEntity;
    }
}

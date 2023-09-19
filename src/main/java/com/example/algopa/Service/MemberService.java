package com.example.algopa.Service;

import com.example.algopa.DTO.MemberDTO;
import com.example.algopa.Entity.MemberEntity;
import com.example.algopa.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// Entity -> DTO (Entity Class의 작업)
// DTO -> Entity (DTO Class의 작업)

@Service
@RequiredArgsConstructor //Lombok 스프링에서 DI(의존성 주입)의 방법 중에 생성자 주입을 임의의 코드없이 자동으로 설정해주는 어노테이션
public class MemberService {
    public final MemberRepository memberRepository; //어노테이션으로 생성자 주입
    public void save(MemberDTO memberDTO) {
        MemberEntity memberEntity = MemberEntity.toSaveEntity(memberDTO);
        memberRepository.save(memberEntity);
    }
}

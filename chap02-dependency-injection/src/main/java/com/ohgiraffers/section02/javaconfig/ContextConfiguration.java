package com.ohgiraffers.section02.javaconfig;


import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {


    @Bean(name = "acount")
    public Account accountGenerator(){
        return new PersonalAccount(20,"333-23-33333");

    }
    @Bean(name = "member")
    public MemberDTO memberGenerator(){
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("홍길동");
        member.setPhone("ghdpfdf@gmail.com");
        member.setPersonalAccount(accountGenerator());
        return member;
    }
}

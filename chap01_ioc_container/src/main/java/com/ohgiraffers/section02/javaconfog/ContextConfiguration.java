package com.ohgiraffers.section02.javaconfog;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection02")
public class ContextConfiguration {

    @Bean(name = "member")
    public MemberDTO getMember(){
        return new MemberDTO(1,"user01","pass01","홍길동");
    }
}

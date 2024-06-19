package com.ohgiraffers.section02.javaconfog;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application01 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO memberDTO =(MemberDTO) context.getBean("member");
        System.out.println(memberDTO);
    }
}

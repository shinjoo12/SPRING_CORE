package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;

@Component
public class charmander implements Pocketmon{


    @Override
    public void attack() {
        System.out.println("파이리 불꽃 공격");
    }
}

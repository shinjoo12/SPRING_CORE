package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;

@Component
public class squirtle implements Pocketmon{


    @Override
    public void attack() {
        System.out.println("꼬부기 물대포 발사");
    }
}

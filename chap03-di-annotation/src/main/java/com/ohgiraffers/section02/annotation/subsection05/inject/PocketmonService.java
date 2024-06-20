package com.ohgiraffers.section02.annotation.subsection05.inject;

import com.ohgiraffers.section02.common.Pocketmon;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

@Service("pokemonServiceInject")
public class PocketmonService {

    // 1. 필드 주입 방식
    //@Inject
    //@Qualifier("charmander")
    private Pocketmon pocketmon;

    @Inject
    public PocketmonService(Pocketmon pocketmon) {
        this.pocketmon = pocketmon;
    }

    public void poketmonAttack(){
        pocketmon.attack();
    }
}


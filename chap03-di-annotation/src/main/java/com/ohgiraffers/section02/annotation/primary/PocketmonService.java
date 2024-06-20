package com.ohgiraffers.section02.annotation.primary;

import com.ohgiraffers.section02.common.Pocketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pokemonServicePrimary")
public class PocketmonService {

    private Pocketmon poketmon;

    @Autowired
    public PocketmonService(Pocketmon poketmon) {
        this.poketmon = poketmon;
    }

    public void poketmonAttack(){
        poketmon.attack();
    }
}


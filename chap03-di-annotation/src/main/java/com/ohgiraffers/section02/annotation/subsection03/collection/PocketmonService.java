package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.common.Pocketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pockemonServiceCollection")
public class PocketmonService {

//    private List<Poketmon> poketmonList;
//
//    public PoketmonService(List<Poketmon> poketmonList) {
//        this.poketmonList = poketmonList;
//    }
//
//    public void poketmonAttack(){
//        poketmonList.forEach(Poketmon::attack);
//    }

    private Map<String, Pocketmon> poketmonMap;

//    @Autowired
//    public PocketmonService(Map<String, Pocketmon> pocketmonMap) {
//        this.pocketmonMap = pocketmonMap;
//    }
//
//    public void pocketmonAttack(){
//        pocketmonMap.forEach((k,v)->{
//            System.out.println("key : " + k);
//            System.out.println("value : ");
//            v.attack();
//        });
//    }

}

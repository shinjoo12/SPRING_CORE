package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Pocketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pockemonServiceQuailfier")
public class PocketmonService {

    /*
    * @Qualifier 어노테이션은 여러 개의 빈 객체 중에서 특정 빈 객체를 이름으로 지정한느 어노테이션이다
    * @primary 어노테이션과 @Qualifier 어노테이션이 함께 쓰였을때 @Qualifier가 우선한다.
     * */

    // 1. 필드 주입 방식
    //@Autowired
    //@Qualifier("charmander")
    private Pocketmon poketmon;


    // 2. 생성자 주입 방식
    @Autowired
    public PocketmonService(@Qualifier("charmander") Pocketmon pocketmon) {
//        this.Pocketmon = Pocketmon;
//    }
//
//    // 3. setter 주입 방식
//    //@Autowired
//    //@Qualifier("charmander")
//    //public void setPoketmon(Poketmon poketmon) {
//    //    this.poketmon = poketmon;
//    //}
//
//    public void pocketmonAttack(){
//        Pocketmon.attack();
//    }
    }
}

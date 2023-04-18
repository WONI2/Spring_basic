package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EasternRestaurant implements Restaurant {
        //셰프
        private Chef chef ;
        //요리코스
        private Course course ;
@Autowired //자동으로 주입하세요
    public EasternRestaurant(@Qualifier("wc") Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }


    //주문하는 기능
        public void order() {
            System.out.println("아시안요리를 주문 합니다");
            course.combineMenu();
            chef.cook();
        }


}

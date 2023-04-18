package com.spring.core.chap04;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component //이 HOTEL클래스의 객체는 스프링이 관리

@NoArgsConstructor
public class Hotel {
//    제어의 역전(IoC) : 객체 생성의 제어권을 외부로 넘긴다.
//    의존성 주입(DI) : 외부에서 생성된 객체를 주입받는 개념

    //레스토랑 객체에 의존
    private Restaurant restaurant;

    //헤드 셰프
    private Chef headChef;
//
//    public Hotel() {
//    }
@Autowired
    //생성자 주입
    public Hotel(Restaurant restaurant, @Qualifier("wc") Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }



    public void inform() {
        System.out.printf("우리호텔의 레스토랑은 %s입니다. 헤드셰프는 %s 입니다 \n",restaurant.getClass().getSimpleName()
                            ,headChef.getClass().getSimpleName());

        restaurant.order();

    }

}

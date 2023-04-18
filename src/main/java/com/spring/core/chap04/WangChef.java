package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("wc") //이름 "wc"를 정해주지 않으면 class명을 camelcase로 가져감.(wangChef)
public class WangChef implements Chef {
    public void cook() {
        System.out.println("일식 요리의 대가 왕입니다");

    }


}

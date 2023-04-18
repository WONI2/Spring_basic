package com.spring.core.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    //테스트 메서드 생성
    @Test
    void lombokTest() {
        Person p = new Person();
        p.setAddress("Gangnam");
        p.setAge(10);
        p.setNickName("banana");

        //@Data를 사용하면 기본 생성자만 만들 수 있음
        //기존의 new Person(nickName, address, age ); 를 작성할 수 없음
        System.out.println("p = " + p);
//원래 class 로  -> ctrl + shift + t
    }

}
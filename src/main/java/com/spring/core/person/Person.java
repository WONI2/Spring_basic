package com.spring.core.person;

import lombok.*;

//@Setter
//@Getter
//@ToString @EqualsAndHashCode @NoArgsConstructor //기본 생성자
//@AllArgsConstructor //모든 파라미터 생성자

@Data
//위의 내용을 한 번에. 실무에서는 쓰지 않도록 할 것.
public class Person {

    private String nickName;
    private String address;
    private int age;



}

package com.spring.core.chap01;

public class EasternRestaurant implements Restaurant{
        //셰프
        private Chef chef = new WangChef();
        //요리코스
        private Course course = new SushiCourse();

        //주문하는 기능
        public void order() {
            System.out.println("아시안요리를 주문 합니다");
            course.combineMenu();
            chef.cook();
        }


}

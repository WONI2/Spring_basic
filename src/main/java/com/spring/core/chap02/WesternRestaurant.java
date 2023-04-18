package com.spring.core.chap02;

public class WesternRestaurant implements Restaurant {
        //셰프
        private Chef chef;
        //요리코스
        private Course course;

    public WesternRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    //주문하는 기능
        public void order() {
            System.out.println("서양요리를 주문 합니다");
            course.combineMenu();
            chef.cook();
        }


}

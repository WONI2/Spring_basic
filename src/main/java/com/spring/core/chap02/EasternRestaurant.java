package com.spring.core.chap02;

public class EasternRestaurant implements Restaurant {
        //셰프
        private Chef chef ;
        //요리코스
        private Course course ;

    public EasternRestaurant(Chef chef, Course course) {
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

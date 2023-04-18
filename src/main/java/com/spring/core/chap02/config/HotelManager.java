package com.spring.core.chap02.config;

import com.spring.core.chap02.*;

//호텔을 운영하기 위한 객체들을 만들어서 호텔에 주입해주는 클래스
//Spring Container : Bean Factory
//모든 객체 생성 담당
public class HotelManager {

    //셰프 객체를 생성.
    public Chef chef() {
        return new WangChef();
    }
    //코스 객체를 생성
    public Course course() {
        return new SushiCourse();

    }
    //레스토랑 객체를 생성
    public Restaurant restaurant () {
        return new EasternRestaurant(chef(), course());
    }
    // 호텔 객체 생성
    public Hotel hotel() {
//        return new Hotel(restaurant(),chef());//생성자 주입
//setter주입. 되도록 생성자 주입하는게 나음. 원할 때 마다 호출이 가능하기 때문에
        Hotel hotel = new Hotel();
        hotel.setHeadChef(chef());
        hotel.setRestaurant(restaurant());
        return hotel;

    }

}

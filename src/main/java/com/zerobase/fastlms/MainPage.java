package com.zerobase.fastlms;

// MainPage 클래스를 만든 목적
// (논리적인주소(인터넷주소)) + 물리적인파일
// 맵핑하기 위해서

// 하나의 주소에 대해서
// 누가 어디서 어떻게 맵핑?
// 후보군? 클래스, 속성, 메소드

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 주소를 맵핑해주는 클래스 -> RestController
@RestController
public class MainPage {

    // 요청에 대한 맵핑
    // ("/") 인덱스라는 기능에 대한 맵핑
    @RequestMapping("/")
    public String index() {
        return "Index Page";
    }
    @RequestMapping("/hello")
    public String hello() {


        return "<p>hello</p> <p>fastlms website!!!</p>";
    }

}

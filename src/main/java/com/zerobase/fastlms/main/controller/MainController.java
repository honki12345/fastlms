package com.zerobase.fastlms.main.controller;

// MainPage 클래스를 만든 목적
// (논리적인주소(인터넷주소)) + 물리적인파일
// 맵핑하기 위해서

// 하나의 주소에 대해서
// 누가 어디서 어떻게 맵핑?
// 후보군? 클래스, 속성, 메소드

import com.zerobase.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 주소를 맵핑해주는 클래스 -> RestController
@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;

    // 요청에 대한 맵핑
    // ("/") 인덱스라는 기능에 대한 맵핑
    @RequestMapping("/")
    public String index() {

//        String email = "honki12@naver.com";
//        String subject = "안녕하세요. 제로베이스 입니다.";
//        String text = "<p>안녕하세요.</p><p>반갑습니다.</p>";
//        mailComponents.sendMail(email, subject, text);
        return "index";
    }

    @RequestMapping("/error/denied")
    public String errorDenied() {


        return "error/denied";
    }



}

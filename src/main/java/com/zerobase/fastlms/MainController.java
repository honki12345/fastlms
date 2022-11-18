package com.zerobase.fastlms;

// MainPage 클래스를 만든 목적
// (논리적인주소(인터넷주소)) + 물리적인파일
// 맵핑하기 위해서

// 하나의 주소에 대해서
// 누가 어디서 어떻게 맵핑?
// 후보군? 클래스, 속성, 메소드

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 주소를 맵핑해주는 클래스 -> RestController
@Controller
public class MainController {

    // 요청에 대한 맵핑
    // ("/") 인덱스라는 기능에 대한 맵핑
    @RequestMapping("/")
    public String index() {



        return "index";
    }

    // request -> Web brower -> Server
    // response -> Server -> Web

    @RequestMapping("/hello")
    public void hello(HttpServletRequest request,
                HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        String str = "<html>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "</head>" +
                "<body>" +
                "<p>hello</p>" +
                "<p>fastlms website!!!</p>" +
                "<p>안녕하세요!!!</p>" +
                "</body>" +
                "</html>";


        printWriter.write(str);
        printWriter.close();
    }


}

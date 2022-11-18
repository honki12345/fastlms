package com.zerobase.fastlms.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MemberController {


    @GetMapping("/member/register")
    public String register() {

        return "member/register";
    }

    // request Web -> server
    // response server -> web
    @PostMapping("/member/register")
    public String registerSubmit(HttpServletRequest request
        ,HttpServletResponse response) {

        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");

        System.out.println("userId:" + userId);
        System.out.println("userName:" + userName);
        System.out.println("password:" + password);
        System.out.println("phone:" + phone);
        return "member/register";

    }


}

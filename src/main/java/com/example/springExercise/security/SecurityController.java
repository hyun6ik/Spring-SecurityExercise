package com.example.springExercise.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/loginPage")
    public String loginPage(){
        return "loginPage";
    }

    @GetMapping("/user")
    public String user(){
        return "Welcome User";
    }

    @GetMapping("/admin/pay")
    public String adminpay(){
        return "Welcome ADMIN PAY";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome ADMIN and SYS";
    }
}

package com.example.springExercise.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

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

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/denied")
    public String denied(){
        return "denied";
    }

    @GetMapping("/authen")
    public String authen(HttpSession session){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        SecurityContext context = (SecurityContext) session.getAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY);
        Authentication findAuthentication = context.getAuthentication();

        return "home";
    }

    @GetMapping("/thread")
    public String thread(){
        new Thread(

                new Runnable() {
                    @Override
                    public void run() {
                        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
                    }
                }


        ).start();
        return "thread";
    }
}


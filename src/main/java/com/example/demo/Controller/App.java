package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class App {

    @GetMapping("/")
    public String getTest() {
        return "login";
    }
    
    @PostMapping("/welcom")
    public String getMethodName(String username ,String password ) {
        return "welcom";
    }
    @GetMapping("/")
    public String getWelcomPage(){
        return "welcom";
    }
    
    
}

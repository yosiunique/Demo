package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class App {

    @GetMapping("/test")
    public String getTest() {
        return "applicant";
    }
    
    
}

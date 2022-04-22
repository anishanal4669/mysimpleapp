package com.example.mysimpleapp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String getGreeting(){
        return "Hello Guys, Greeting to you !!!";
    }

}

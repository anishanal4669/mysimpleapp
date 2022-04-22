package com.example.mysimpleapp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component("CoolBean")
@Lazy
public class MyComponent {

    private LocalTime ts = LocalTime.now();

    public MyComponent(){
        System.out.printf("MyComponent has been created at %s\n",ts);
    }

    @Override
    public String toString(){
        return String.format("Hi from MyComponent been created at %s\n", ts);
    }

}

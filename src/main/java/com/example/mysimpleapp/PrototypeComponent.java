package com.example.mysimpleapp;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
@Lazy
public class PrototypeComponent {

    private static int nextId;
    private int id = nextId++;

    public PrototypeComponent(){
        System.out.printf("PrototypeComponent bean %d created \n",id);
    }

    @Override
    public String toString(){
        return String.format("Hi from PrototypeComponent %d", id);
    }

}

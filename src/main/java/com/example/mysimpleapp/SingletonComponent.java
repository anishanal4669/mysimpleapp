package com.example.mysimpleapp;

import org.springframework.stereotype.Component;

@Component
public class SingletonComponent {

    private static int nextId;
    private int id = nextId++;

    public SingletonComponent(){
        System.out.printf("SingletonComponent bean %d created \n",id);
    }

    @Override
    public String toString(){
        return String.format("Hi from SingletonComponent %d", id);
    }
}

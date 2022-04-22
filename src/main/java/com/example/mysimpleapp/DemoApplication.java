package com.example.mysimpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("*************** Before SpringApplication.run ************");
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		System.out.println("*************** After SpringApplication.run **************");
		demoSingleton(ctx);
		demoPrototype(ctx);
	}

	private static void demoSingleton(ApplicationContext ctx){
		SingletonComponent bean1 = ctx.getBean("singletonComponent", SingletonComponent.class);
		SingletonComponent bean2 = ctx.getBean("singletonComponent", SingletonComponent.class);
		SingletonComponent bean3 = ctx.getBean("singletonComponent", SingletonComponent.class);
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
	}

	private static void demoPrototype(ApplicationContext ctx){
		PrototypeComponent bean1 = ctx.getBean("prototypeComponent", PrototypeComponent.class);
		PrototypeComponent bean2 = ctx.getBean("prototypeComponent", PrototypeComponent.class);
		PrototypeComponent bean3 = ctx.getBean("prototypeComponent", PrototypeComponent.class);
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
	}


}

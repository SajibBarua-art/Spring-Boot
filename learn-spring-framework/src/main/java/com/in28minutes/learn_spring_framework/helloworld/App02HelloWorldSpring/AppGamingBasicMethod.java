package com.in28minutes.learn_spring_framework.helloworld.App02HelloWorldSpring;

import com.in28minutes.learn_spring_framework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppGamingBasicMethod {
    public static void main(String[] args) {
        // 1: Launch a spring context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2: Configure the things that we want Spring to manage - @configure
            // HelloWorldConfiguration - @configure
            // name - @Bean

            // 3: Retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("address2"));

            // to list all the beans
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}

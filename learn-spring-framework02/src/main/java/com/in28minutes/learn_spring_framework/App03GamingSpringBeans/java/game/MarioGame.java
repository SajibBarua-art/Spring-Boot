package com.in28minutes.learn_spring_framework.App03GamingSpringBeans.java.game;

import com.in28minutes.learn_spring_framwork.game.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Mario up");
    }
    public void down() {
        System.out.println("Mario fall into a hole");
    }
    public void left() {
        System.out.println("Mario Go back");
    }
    public void right() {
        System.out.println("Mario accelerate");
    }
}

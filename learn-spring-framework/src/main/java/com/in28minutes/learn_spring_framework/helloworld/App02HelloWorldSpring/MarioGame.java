package com.in28minutes.learn_spring_framework.helloworld.App02HelloWorldSpring;

import com.in28minutes.learn_spring_framwork.game.GamingConsole;

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

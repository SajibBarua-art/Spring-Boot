package com.in28minutes.learn_spring_framework.helloworld.App02HelloWorldSpring;

import com.in28minutes.learn_spring_framwork.game.GamingConsole;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Super Contra Game up");
    }
    public void down() {
        System.out.println("Super Contra Game fall into a hole");
    }
    public void left() {
        System.out.println("Super Contra Game Go back");
    }
    public void right() {
        System.out.println("Super Contra Game accelerate");
    }
}

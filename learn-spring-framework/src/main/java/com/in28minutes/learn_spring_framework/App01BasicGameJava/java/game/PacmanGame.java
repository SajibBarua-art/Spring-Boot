package com.in28minutes.learn_spring_framework.App01BasicGameJava.java.game;

import com.in28minutes.learn_spring_framwork.game.GamingConsole;

public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println("Pacman up");
    }
    public void down() {
        System.out.println("Pacman fall into a hole");
    }
    public void left() {
        System.out.println("Pacman Go back");
    }
    public void right() {
        System.out.println("Pacman accelerate");
    }
}

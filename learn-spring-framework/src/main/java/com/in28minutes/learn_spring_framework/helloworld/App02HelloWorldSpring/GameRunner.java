package com.in28minutes.learn_spring_framework.helloworld.App02HelloWorldSpring;

import com.in28minutes.learn_spring_framwork.game.GamingConsole;

public class GameRunner {

    GamingConsole gameConsole;
    public GameRunner(GamingConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    public void run() {
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();
    }
}

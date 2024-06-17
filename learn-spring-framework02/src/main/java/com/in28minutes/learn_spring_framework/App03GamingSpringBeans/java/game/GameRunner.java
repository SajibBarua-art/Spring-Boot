package com.in28minutes.learn_spring_framework.App03GamingSpringBeans.java.game;

import com.in28minutes.learn_spring_framwork.game.GamingConsole;
import org.springframework.stereotype.Component;

@Component
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

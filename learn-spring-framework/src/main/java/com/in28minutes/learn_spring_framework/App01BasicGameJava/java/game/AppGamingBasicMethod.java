package com.in28minutes.learn_spring_framework.App01BasicGameJava.java.game;

public class AppGamingBasicMethod {
    public static void main(String[] args) {
        // var game = new SuperContraGame();
        // var game = new MarioGame();
        var game = new PacmanGame();
        var GameRunner = new GameRunner(game);
        GameRunner.run();
    }
}

package com.tormascomp.game.logic;

public class MainLoop {

    public static void main(String[] args) {
        Game game = new Game();
        game.init();

        while (!game.getHero().isDead()) {
            game.doGameCycle();
        }
    }
}

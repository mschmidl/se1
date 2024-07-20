package com.tormascomp.game.logic;

import com.tormascomp.game.map.Map;
import com.tormascomp.game.map.entities.*;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Hero hero = new Hero(10, 10, 10);
    private Map map = new Map();

    private Scanner scanner = new Scanner(System.in);
    private String command;

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void init() {
      //  scanner.useDelimiter("");

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int x = getMapCoord(random);
            int y = getMapCoord(random);
            switch (random.nextInt( 2)) {
                case 0 -> map.setMapEntity(x, y, new Trololol(x, y, 10));
                case 1 -> map.setMapEntity(x, y, new Goblin(x, y, 5));
                default -> {
                }
            }
        }
        int x = getMapCoord(random);
        int y = getMapCoord(random);
        map.setMapEntity(getMapCoord(random), getMapCoord(random), new Exit(x,y));
        map.setMapEntity(hero.getX(), hero.getY(), hero);
    }

    private static int getMapCoord(Random random) {
        return random.nextInt(20);
    }

    public void doGameCycle() {
        if (hero.isGay()) {
            hero.setExperience(hero.getExperience() + 1);
        }
        System.out.println(map.fetchMap());
        parseInput();
        resolveEncounter();
    }

    private void resolveEncounter() {
        if (map.isOccupied(hero.getX(), hero.getY())) {
            MapEntity mapEntity = map.getMapEntity(hero.getX(), hero.getY());
            System.out.println(mapEntity.getEncounterMessage());
            mapEntity.getEncounterResolver().resolve(mapEntity, hero);
        }
    }

    private void parseInput() {
        command = scanner.next();

        switch (command) {
            case "w":
                moveUp();
                System.out.println("X = " + hero.getX() + " Y = " + hero.getY());
                break;
            case "a":
                moveLeft();
                System.out.println("X = " + hero.getX() + " Y = " + hero.getY());
                break;
            case "s":
                moveDown();
                System.out.println("X = " + hero.getX() + " Y = " + hero.getY());
                break;
            case "d":
                moveRight();
                System.out.println("X = " + hero.getX() + " Y = " + hero.getY());
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    private void moveRight() {
        hero.setX(hero.getX() + 1);
    }

    private void moveDown() {
        hero.setY(hero.getY() + 1);
    }

    private void moveLeft() {
        hero.setX(hero.getX() - 1);
    }

    private void moveUp() {
        hero.setY(hero.getY() - 1);
    }
}

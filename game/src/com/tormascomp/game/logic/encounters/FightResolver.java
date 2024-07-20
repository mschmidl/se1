package com.tormascomp.game.logic.encounters;

import com.tormascomp.game.map.entities.Enemy;
import com.tormascomp.game.map.entities.Hero;
import com.tormascomp.game.map.entities.MapEntity;

import java.util.Scanner;

public class FightResolver implements IEncounterResolver {
    private Scanner scanner = new Scanner(System.in);
    private String command;

    public FightResolver() {
        //scanner.useDelimiter("");
    }

    @Override
    public void resolve(MapEntity mapEntity, Hero hero) {

        if (!(mapEntity instanceof Enemy)) {
            System.out.println("Dude, you can't fight that...");
            return;
        }
        Enemy enemy = (Enemy) mapEntity;
        boolean flee = false;

        while (!enemy.isDead() && !hero.isDead() && !flee) {
            System.out.println("(F)ight/(R)un");

            command = scanner.next();

            switch (command) {
                case "F":
                case "f":
                    System.out.println("You died");
                    hero.setHealth(0);
                    break;
                case "r":
                case "R":
                    System.out.println("You lived");
                    flee = true;
                    break;
        }
        }

    }
}

package com.game;

public class Level1EnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy(String type) {
        switch (type) {
            case "Goblin":
                return new Goblin();
            case "Zombie":
                return new Zombie();
            default:
                throw new IllegalArgumentException("Unknown enemy type for Level 1.");
        }
    }
}

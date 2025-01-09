package com.game;

public class Level2EnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy(String type) {
        switch (type) {
            case "Goblin":
                return new Goblin();
            case "Dragon":
                return new Dragon();
            default:
                throw new IllegalArgumentException("Unknown enemy type for Level 2.");
        }
    }
}

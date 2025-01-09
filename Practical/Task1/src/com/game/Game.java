package com.game;

public class Game {
    public static void main(String[] args) {
        // Step 1: Access Singleton GameState
        GameState gameState = GameState.getInstance();
        gameState.setCurrentLevel(1);
        gameState.setDifficulty("Easy");
        gameState.displayState();

        // Step 2: Use Factory Method to create enemies
        EnemyFactory level1EnemyFactory = new Level1EnemyFactory();
        Enemy goblin = level1EnemyFactory.createEnemy("Goblin");
        goblin.attack();
        Enemy zombie = level1EnemyFactory.createEnemy("Zombie");
        zombie.attack();

        // Step 3: Use Abstract Factory to create weapons and power-ups
        GameItemFactory level1ItemFactory = new Level1ItemFactory();
        Weapon level1Weapon = level1ItemFactory.createWeapon();
        PowerUp level1PowerUp = level1ItemFactory.createPowerUp();
        level1Weapon.use();
        level1PowerUp.activate();

        // Step 4: Move to Level 2
        gameState.setCurrentLevel(2);
        gameState.setDifficulty("Hard");
        gameState.displayState();

        EnemyFactory level2EnemyFactory = new Level2EnemyFactory();
        Enemy dragon = level2EnemyFactory.createEnemy("Dragon");
        dragon.attack();

        GameItemFactory level2ItemFactory = new Level2ItemFactory();
        Weapon level2Weapon = level2ItemFactory.createWeapon();
        PowerUp level2PowerUp = level2ItemFactory.createPowerUp();
        level2Weapon.use();
        level2PowerUp.activate();
    }
}

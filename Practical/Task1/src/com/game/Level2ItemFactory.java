package com.game;


public class Level2ItemFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Fireball();
    }

    @Override
    public PowerUp createPowerUp() {
        return new Shield();
    }
}
package com.game;

public interface GameItemFactory {
    Weapon createWeapon();
    PowerUp createPowerUp();
}
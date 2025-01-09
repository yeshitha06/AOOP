package com.game;

public class Zombie implements Enemy {
    @Override
    public void attack() {
        System.out.println("Zombie lunges forward!");
    }
}

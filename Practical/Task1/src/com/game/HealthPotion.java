package com.game;

public class HealthPotion implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Health restored!");
    }
}
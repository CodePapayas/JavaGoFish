package com.zzwo.game;

public class PlayingCard {
    private String fish;
    private String color;

    public PlayingCard(String fish, String color) {
        this.fish = fish;
        this.color = color;
    }

    public String getFish() {
        return fish;
    }

    public String getColor() {
        return color;
    }
}

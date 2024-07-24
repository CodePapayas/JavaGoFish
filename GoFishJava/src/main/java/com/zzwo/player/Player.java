package com.zzwo.player;
import java.util.*;

public class Player {
    private HashMap<String, ArrayList<String>> playerHand = new HashMap<>();
    private HashMap<String, ArrayList<String>> playerMatchPile = new HashMap<>();

    public void addCard(String color, String card) {
        if (!playerHand.containsKey(color)) {
            playerHand.put(color, new ArrayList<String>());
        }
        playerHand.get(color).add(card);
    }

    public void addMatch(String color, String card) {
        if (!playerMatchPile.containsKey(color)) {
            playerMatchPile.put(color, new ArrayList<String>());
        }
        playerMatchPile.get(color).add(card);
    }

    public void showHand() {
        for (String color : playerHand.keySet()) {
            System.out.println("Color: " + color + " Cards: " + playerHand.get(color));
        }
    }

    public void showMatches() {
        for (String color : playerMatchPile.keySet()) {
            System.out.println("Color: " + color + " Cards: " + playerMatchPile.get(color));
        }
    }

    public boolean checkForMatch(String color, String fish) {
        Boolean matchFound = false;
        for (String colors : playerHand.keySet()) {
            for (String fishType : playerHand.get(colors)) {
                if (color.equals(colors) || fish.equals(fishType)) {
                    matchFound = true;
                }
            }
        }
        return matchFound;
    }
}
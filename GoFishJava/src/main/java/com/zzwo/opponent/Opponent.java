package com.zzwo.opponent;
import java.util.HashMap;
import java.util.ArrayList;

public class Opponent {
    private HashMap<String, ArrayList<String>> oppHand = new HashMap<>();
    private HashMap<String, ArrayList<String>> oppMatchPile = new HashMap<>();

    public void addCard(String color, String card) {
        if (!oppHand.containsKey(color)) {
            oppHand.put(color, new ArrayList<String>());
        }
        oppHand.get(color).add(card);
    }

    public void addMatch(String color, String card) {
        if (!oppMatchPile.containsKey(color)) {
            oppMatchPile.put(color, new ArrayList<String>());
        }
        oppMatchPile.get(color).add(card);
    }

    public void showHand() {
        for (String color : oppHand.keySet()) {
            System.out.println("Color: " + color + " Cards: " + oppHand.get(color));
        }
    }

    public void showMatches() {
        for (String color : oppMatchPile.keySet()) {
            System.out.println("Color: " + color + " Cards: " + oppMatchPile.get(color));
        }
    }

    public boolean checkForMatch(String color, String fish) {
        Boolean matchFound = false;
        for (String colors : oppHand.keySet()) {
            for (String fishType : oppHand.get(colors)) {
                if (color.equals(colors) || fish.equals(fishType)) {
                    matchFound = true;
                }
            }
        }
        return matchFound;
    }
}

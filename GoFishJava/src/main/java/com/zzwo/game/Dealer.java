package com.zzwo.game;
import com.zzwo.opponent.Opponent;
import com.zzwo.player.Player;

import java.util.*;

public class Dealer {

    private HashMap<String, ArrayList<String>> cardDeck;
    private String[] colors;

    public Dealer(String[] colors, String[] fish) {
        this.colors = colors;
        cardDeck = new HashMap<>();
        initializeDeck(colors, fish);
        shuffleDeck();
    }

    private void initializeDeck(String[] colors, String[] fish) {
        for (String color: colors) {
            cardDeck.putIfAbsent(color, new ArrayList<>());
            for (String fishCard : fish) {
                cardDeck.get(color).add(fishCard);
            }
        }
    }

    private void shuffleDeck() {
        for (ArrayList<String> cardList : cardDeck.values()) {
            Collections.shuffle(cardList);
        }
        List<String> colorList = Arrays.asList(colors);
        Collections.shuffle(colorList);
        colors = colorList.toArray(new String[0]);
    }

    public void dealCards(Opponent opponent, Player player) {
        int cardsDealt = 0;

        while (cardsDealt < 14) {
            List<String> randomColors = Arrays.asList(colors.clone());
            Collections.shuffle(randomColors);

            for (String col : randomColors) {
                List<String> cardList = new ArrayList<>(cardDeck.get(col));
                Collections.shuffle(cardList);

                if (!cardList.isEmpty()) {
                    String card = cardList.remove(0);
                    if (cardsDealt % 2 == 0) {
                        opponent.addCard(col, card);
                    } else {
                        player.addCard(col, card);
                    }
                    cardsDealt++;
                    break;
                }
        }}
    }
}

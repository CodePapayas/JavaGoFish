package com.zzwo.game;
import com.zzwo.opponent.Opponent;
import com.zzwo.player.Player;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        String[] fish = {
                "King Prawn", "Angelfish", "Jack Dempsey", "Pacific Salmon",
                "Clownfish", "Blue Tang", "Lionfish", "Electric Eel", "Great White Shark",
                "Sea Turtle", "Manta Ray", "Dolphin", "Whale Shark"
        };
        String[] color = {
                "Red", "Blue", "Green", "Yellow"
        };

        Opponent opponent = new Opponent();
        Player player = new Player();

        Dealer dealer = new Dealer(color, fish);
        dealer.dealCards(opponent, player);

        Scanner cardGuess = new Scanner(System.in);

        System.out.println("Opponent Hand");
        opponent.showHand();
        System.out.println("Player Hand");
        player.showHand();
    }
}
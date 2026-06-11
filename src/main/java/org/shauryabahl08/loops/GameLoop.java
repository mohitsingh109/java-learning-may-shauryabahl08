package org.shauryabahl08.loops;

import java.util.Scanner;

public class GameLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int player1Health = 100;
        int player2Health = 100;

        boolean isPlayer1Turn = true;

        while(player1Health > 0 && player2Health > 0) {
            //----- this is to get the player name------
            String playerName;
            if (isPlayer1Turn) {
                playerName = "Player 1";
            } else {
                playerName = "Player 2";
            }
            // ----------------------------------------
            System.out.println(playerName + " Enter your attack: ");
            int attack = sc.nextInt();

            if (isPlayer1Turn) {
                System.out.println(playerName + " perform attach on player2 with a damage of " + attack);
                player2Health -= attack;
            } else {
                System.out.println(playerName + " perform attach on player1 with a damage of " + attack);
                player1Health -= attack;
            }

            isPlayer1Turn = !isPlayer1Turn; // change the turn
            System.out.println("Player1 Health: " + player1Health);
            System.out.println("Player2 Health: " + player2Health);
        }

        if(player1Health > 0) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}

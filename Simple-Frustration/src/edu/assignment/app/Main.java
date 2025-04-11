package edu.assignment.app;

import edu.assignment.board.Board;
import edu.assignment.board.BoardPositions;
import edu.assignment.dice.*;
import edu.assignment.player.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Board
        Board board = new Board();

        //Create Player Objects
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        player1.playerPath(board.player1path);
        player2.playerPath(board.player2path);

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of dice to use (1 or 2): ");
        int diceCount = scanner.nextInt();

        DiceShaker shaker = switch (diceCount) {
            case 1 -> new RandomSingleDiceShaker(new SixSidedDice());
            case 2 -> new DoubleDiceDecorator(new RandomSingleDiceShaker(new SixSidedDice()), new SixSidedDice());
            default -> {
                System.out.println("Invalid choice. Defaulting to 1 die.");
                yield new RandomSingleDiceShaker(new SixSidedDice());
            }
        };

// Wrap the final shaker ONCE with logging
        shaker = new LoggingDiceShakerDecorator(shaker);


        boolean gameOver = false;
        while(!gameOver) {
            for(Player player : players) {

                if(player == player1) {
                    System.out.println("\u001B[31m");
                }else if(player == player2) {
                    System.out.println("\u001B[34m");
                }



                System.out.println(player.getName());
                System.out.println("Turn: " + player.getTurn());

                System.out.println("Current Position: " + player.getCurrentPosition());

                player.setNewPosition(shaker.shake());
                System.out.println("New Position: " + player.getCurrentPosition());


                boolean end = player.isAtEnd();
                if(end) {
                    System.out.println("\n" + player.getName() + " won! In " + player.getTurn() + " turns");
                    gameOver = true;
                    break;
                }

                player.incrementTurn();



            }
        }

        int i = player1.getTurn() + player2.getTurn();
        System.out.println("\u001B[0mTotal Turns: " + i );

    }

}

package edu.assignment.app;

import edu.assignment.board.Board;
import edu.assignment.dice.*;
import edu.assignment.player.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Board Size 18 - Type 1 ");
        System.out.println("Board Size 36 - Type 2 ");
        int size = scanner.nextInt();

        //Create Board
        Board board = new Board(size);

        //Create Player Objects
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        player1.playerPath(board.player1path);
        player2.playerPath(board.player2path);

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);


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

        shaker = new LoggingDiceShakerDecorator(shaker);

        System.out.println("Basic Game - Type 1 ");
        System.out.println("Home when Hit - Type 2 ");
        int mode = scanner.nextInt();

        boolean gameOver = false;
        while(!gameOver) {
            switch (mode) {
                case 1:
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
                    case 2:
                        for (int i = 0; i < players.size(); i++) {
                            Player player = players.get(i);
                            Player nextPlayer = players.get((i + 1) % players.size()); // circular reference

                            // Color output
                            if (player == player1) {
                                System.out.println("\u001B[31m"); // Red
                            } else if (player == player2) {
                                System.out.println("\u001B[34m"); // Blue
                            }

                            System.out.println(player.getName());
                            System.out.println("Turn: " + player.getTurn());
                            System.out.println("Current Position: " + player.getCurrentPosition());

                            int roll = shaker.shake();
                            player.setNewPosition(roll);

                            if(player.getCurrentPosition() == nextPlayer.getCurrentPosition()) {
                                player.currentPosition = 0;
                                System.out.println("\u001B[32mLanded on the other player, Going home\u001B[0m ");
                            }

                            System.out.println("New Position: " + player.getCurrentPosition());


                            if (player.isAtEnd()) {
                                System.out.println("\n" + player.getName() + " won! In " + player.getTurn() + " turns");
                                gameOver = true;
                                break;
                            }

                            player.incrementTurn();
                        }
            }




        }

        int i = player1.getTurn() + player2.getTurn();
        System.out.println("\u001B[0mTotal Turns: " + i );

    }

}

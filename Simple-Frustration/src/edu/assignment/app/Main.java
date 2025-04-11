package edu.assignment.app;

import edu.assignment.board.Board;
import edu.assignment.board.BoardPositions;
import edu.assignment.dice.*;
import edu.assignment.player.*;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create Board
        Board board = new Board();

        DiceShaker shaker = new LoggingDiceShakerDecorator(new RandomSingleDiceShaker(new SixSidedDice()));

        //Create Player Objects
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        player1.playerPath(board.player1path);
        player2.playerPath(board.player2path);

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

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

                int roll = shaker.shake();


                player.setNewPosition(roll);
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
    public static void show(DiceShaker shaker) {
        shaker.shake();
    }

}

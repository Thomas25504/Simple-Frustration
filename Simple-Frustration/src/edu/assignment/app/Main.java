package edu.assignment.app;

import edu.assignment.board.Board;
import edu.assignment.dice.*;
import edu.assignment.player.*;

public class Main {
    public static void main(String[] args) {
        //Create Board
        Board board = new Board();

        //Create Player Objects
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        //Dice Shaker
        DiceShakerFactory singleFactory = new SingleDiceShakerFactory();
        DiceShakerFactory doubleFactory = new DoubleDiceShakerFactory();
        DiceShakerFactory tripleFactory = new TripleDiceShakerFactory();

        DiceShaker single = new LoggingDiceShakerDecorator(singleFactory.create());
        DiceShaker dbl = new LoggingDiceShakerDecorator(doubleFactory.create());
        DiceShaker triple = new LoggingDiceShakerDecorator(tripleFactory.create());



        System.out.println("\u001B[31m" + player1.getName() + "\u001B[0m");
        System.out.println("\u001B[34m" + player2.getName() + "\u001B[0m");

    }
    public static void show(DiceShaker shaker) {
        shaker.shake();
    }

}

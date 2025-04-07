package edu.assignment.dice;

public class SixSidedDice implements Dice{

    @Override
    public int roll(){
        return (int)(Math.random() * 6) + 1;
    }
}

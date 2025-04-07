package edu.assignment.dice;

import java.util.Random;

public class RandomSingleDiceShaker implements DiceShaker {
    private Dice dice;

    public RandomSingleDiceShaker(Dice dice) {
        this.dice = dice;
    }

    private final Random random = new Random();

    @Override
    public int shake() {
        return dice.roll();
    }
}

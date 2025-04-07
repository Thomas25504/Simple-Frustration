package edu.assignment.dice;

public class FixedSingleDiceShaker implements DiceShaker{

    private final int[] shakes = new int[]{
            1, 2, 3, 4, 5, 6
    };

    private int index;

    @Override
    public int shake(){
        return shakes[index++];
    };

}

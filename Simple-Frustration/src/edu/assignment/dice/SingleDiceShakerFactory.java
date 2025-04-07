package edu.assignment.dice;

public class SingleDiceShakerFactory implements DiceShakerFactory{
    @Override
    public DiceShaker create(){
        return new RandomSingleDiceShaker(new SixSidedDice());
    }
}

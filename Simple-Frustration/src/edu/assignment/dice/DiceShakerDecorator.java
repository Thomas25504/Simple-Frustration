package edu.assignment.dice;

public abstract class DiceShakerDecorator implements DiceShaker {
    protected DiceShaker shaker;

    public DiceShakerDecorator(DiceShaker shaker) {
        this.shaker = shaker;
    }
}

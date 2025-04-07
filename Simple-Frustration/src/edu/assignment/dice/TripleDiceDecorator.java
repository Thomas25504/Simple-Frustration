package edu.assignment.dice;

public class TripleDiceDecorator  extends DiceShakerDecorator{
    private Dice extraDice1;
    private Dice extraDice2;

    public TripleDiceDecorator(DiceShaker shaker, Dice extraDice1, Dice extraDice2) {
        super(shaker);
        this.extraDice1 = extraDice1;
        this.extraDice2 = extraDice2;
    }

    @Override
    public int shake() {
        return shaker.shake() + extraDice1.roll() + extraDice2.roll();
    }
}

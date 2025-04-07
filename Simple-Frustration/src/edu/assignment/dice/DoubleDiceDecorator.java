package edu.assignment.dice;

public class DoubleDiceDecorator extends DiceShakerDecorator{
    private Dice extraDice;

    public DoubleDiceDecorator(DiceShaker shaker, Dice extraDice){
        super(shaker);
        this.extraDice = extraDice;
    }

    @Override
    public int shake() {
        return shaker.shake() + extraDice.roll();
    }

}

package edu.assignment.dice;

public class TripleDiceShakerFactory implements DiceShakerFactory {
    private DiceShakerFactory factory = new DoubleDiceShakerFactory();

    @Override
    public DiceShaker create() {
        DiceShaker doubleDice = factory.create();
        return new TripleDiceDecorator(doubleDice, new SixSidedDice(), new SixSidedDice());
    }
}

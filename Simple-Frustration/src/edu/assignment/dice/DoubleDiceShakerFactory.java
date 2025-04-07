package edu.assignment.dice;

public class DoubleDiceShakerFactory implements DiceShakerFactory {
    private DiceShakerFactory factory = new SingleDiceShakerFactory();

    @Override
    public DiceShaker create() {
        DiceShaker single = factory.create();
        return new DoubleDiceDecorator(single, new SixSidedDice());
    }
}

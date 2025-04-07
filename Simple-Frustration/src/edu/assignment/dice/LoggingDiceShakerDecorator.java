package edu.assignment.dice;

public class LoggingDiceShakerDecorator implements DiceShaker {
    private DiceShaker shaker;

    public LoggingDiceShakerDecorator(DiceShaker shaker) {
        this.shaker = shaker;
    }

    @Override
    public int shake(){
        int result = shaker.shake();
        System.out.format("%d%n", result);
        return result;
    }
}

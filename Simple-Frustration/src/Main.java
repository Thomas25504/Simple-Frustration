import edu.assignment.dice.*;

public class Main {
    public static void main(String[] args) {
        DiceShakerFactory singleFactory = new SingleDiceShakerFactory();
        DiceShakerFactory doubleFactory = new DoubleDiceShakerFactory();
        DiceShakerFactory tripleFactory = new TripleDiceShakerFactory();

        DiceShaker single = new LoggingDiceShakerDecorator(singleFactory.create());
        DiceShaker dbl = new LoggingDiceShakerDecorator(doubleFactory.create());
        DiceShaker triple = new LoggingDiceShakerDecorator(tripleFactory.create());

        show(single);
        show(dbl);
        show(triple);
    }
    public static void show(DiceShaker shaker) {
        shaker.shake(); 
    }

}

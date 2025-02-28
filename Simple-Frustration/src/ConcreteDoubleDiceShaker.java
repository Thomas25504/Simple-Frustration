public class ConcreteDoubleDiceShaker extends AbstractDiceShaker {
    @Override
    public int shake() {
//generate number between 1 and 6
        return shakeSingleDie() + shakeSingleDie();
    }
}
import java.util.Random;

public abstract class AbstractDiceShaker {

    private final Random random = new Random();

    protected int shakeSingleDie(){
        return random.nextInt(6) + 1;
    };

    public abstract int shake();
}

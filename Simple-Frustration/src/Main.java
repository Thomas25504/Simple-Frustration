public class Main {
    public static void main(String[] args) {
            DiceShaker shaker = new RandomSingleDiceShaker();
            System.out.format("Shake %d%n", shaker.shake());
        }
}

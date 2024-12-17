import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator {

    private final Random random;
    private final HashSet<Integer> alreadyNumbers;

    public NumberGenerator() {
        this.random = ThreadLocalRandom.current();
        this.alreadyNumbers = new HashSet<>();
    }

    public int generateLottoNumber() {
        int number = pickRandomNumber(1, 45);

        while (!alreadyNumbers.contains(number)) {
            number = pickRandomNumber(1, 45);
            alreadyNumbers.add(number);
        }

        return number;
    }

    public int generateMovement() {
        return pickRandomNumber(-1, 1);
    }

    public int generateInitIndex() {
        return pickRandomNumber(0, 20);
    }

    private int pickRandomNumber(int minValue, int maxValue) {
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }

}

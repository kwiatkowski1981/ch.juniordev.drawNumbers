import java.util.Random;

public class NumberInfo {


    public static void main(String[] args) {

        Random random = new Random();

        final int maxDigit = 10000;
        int randomInt = random.nextInt(maxDigit);
        System.out.println("the drawn number is: " + randomInt);

        NumberUtils numberUtils = new NumberUtils();

        numberUtils.compareNumberAndPrint(randomInt);
        numberUtils.printOddOrEven(randomInt);
        System.out.println("number's padded to four digits: " + numberUtils.getFourDigitNumber(randomInt));

    }
}

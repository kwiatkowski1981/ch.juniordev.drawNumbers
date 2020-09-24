public class NumberUtils {

    public void compareNumberAndPrint(int number) {

        int compareTo = 10000;

        if (number == compareTo)
            System.out.println("the number is: " + compareTo);
        else if (number < compareTo)
            System.out.println("the number is less than " + compareTo);
        else
            System.out.println("the number is greater than " + compareTo);
    }

    void printOddOrEven(int number) {
        if (number % 2 == 0)
            System.out.println(number + " there is an even number");
        else
            System.out.println(number + " there is an odd number");
    }

    int getFourDigitNumber(int number) {
        if (number / 1000 != 0)
            return number;
        else if (number / 100 != 0)
            return number * 10;
        else if (number / 10 != 0)
            return number * 100;
        else
            return number * 1000;
    }
}


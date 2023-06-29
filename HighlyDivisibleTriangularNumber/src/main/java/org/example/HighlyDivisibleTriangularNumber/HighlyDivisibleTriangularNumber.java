package org.example.HighlyDivisibleTriangularNumber;

public class HighlyDivisibleTriangularNumber {

    public static int firstDivisibleNumber(int divsibleNumbers) {
        boolean found = false;
        int numberSum = 0;
        int factorDivisibleNumber = 0;

        for (int counter = 1; !found; counter++) {

            numberSum = numberSum(counter);
            factorDivisibleNumber = factorDivisibleNumber(numberSum);
            found = factorDivisibleNumber >= divsibleNumbers;

            System.out.println(numberSum + " " + factorDivisibleNumber + " " + found);
        }

        return factorDivisibleNumber;
    }

    private static int factorDivisibleNumber(int numberSum) {
        int counternumberSum = 0;

        for (int counter = numberSum; counter > 0; counter--) {
            counternumberSum = numberSum % counter == 0 ? counternumberSum + 1 : counternumberSum ;
        }

        return counternumberSum;
    }

    private static int numberSum(int counter) {
        int result = 0;

        for (int counter2 = 1; counter2 <= counter; counter2++) {
            result += counter2;
        }

        return result;
    }
}

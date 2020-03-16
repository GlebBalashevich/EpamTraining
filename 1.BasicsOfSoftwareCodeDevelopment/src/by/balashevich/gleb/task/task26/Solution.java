package by.balashevich.gleb.task.task26;

public class Solution {
    public static void main(String[] args) {
        System.out.println("==== Task 25 ====");
        System.out.println("Result: " + calculateFunction());
    }

    public static String calculateFunction() {
        double eNumber = 0.01;
        double aValue = 0;
        int n = 1;
        double result = 0;

        do {
            if (n != 0) {
                aValue = Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n));
            }
            result += aValue;
            n++;
        }
        while (aValue >= eNumber);

            return String.valueOf(result);
    }
}

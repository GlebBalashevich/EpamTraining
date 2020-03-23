package by.balashevich.gleb.task.task103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("======= TASK 103 =======");
        calculateFunction();
    }

    public static void calculateFunction() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int negativeNumbers = 0;
        int positiveNumbers = 0;
        int zeroNumbers = 0;
        int n = 10;
        double[] numbers = new double[n];

        System.out.println("We initialized an array with a length of " + n + " elements. Put a numbers please:");
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = Double.parseDouble(reader.readLine());
                System.out.println("Index: " + (i+1) + " || Value: " + numbers[i]);
            } catch (NumberFormatException | IOException e) {
                System.out.println("You put invalid number, try again");
                i--;
            }
        }

        try{
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        for (double number : numbers) {
            if (number < 0) {
                negativeNumbers++;
            }
            if (number == 0) {
                zeroNumbers++;
            }
            if (number > 0) {
                positiveNumbers++;
            }
        }
        System.out.println("Negative number: " + negativeNumbers + " Zero numbers: " + zeroNumbers + " Positive numbers: " + positiveNumbers);
    }
}

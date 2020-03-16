package by.balashevich.gleb.task.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("==== Task 29 ====");
        calculateFunction();
    }

    public static void calculateFunction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Put first number");
        int firstNum = Integer.parseInt(reader.readLine());
        System.out.println("Put second number");
        int secondNum = Integer.parseInt(reader.readLine());
        reader.close();

        ArrayList<Integer> digits = new ArrayList<>();
        int firstDigits = firstNum;
        int secondDigits;

        while (firstDigits > 0){
            int digit = firstDigits % 10;
            firstDigits /= 10;
            secondDigits = secondNum;
            while(secondDigits > 0){
                if (digit == secondDigits % 10 && !digits.contains(digit)){
                    digits.add(digit);
                    break;
                }
                secondDigits /= 10;
            }
        }

        System.out.println("Both number contains next digits: ");
        for(Integer number : digits){
            System.out.print(number + " ");
        }
    }
}

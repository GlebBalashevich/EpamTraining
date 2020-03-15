package by.balashevich.gleb.task.task21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("==== Task 17 ====");
        System.out.println("Result: " + calculateFunction());

    }

    public static String calculateFunction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        reader.close();

        double result;
        if (x <= 3){
            result = Math.pow(x, 3) - 3 * x + 9;
        }
        else{
            result = 1 / (Math.pow(x, 3) + 6);
        }

        return String.valueOf(result);
    }
}

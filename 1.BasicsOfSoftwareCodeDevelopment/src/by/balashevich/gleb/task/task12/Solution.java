package by.balashevich.gleb.task.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("==== Task 12 ====");
        System.out.println(calculateFunction());
    }

    public static String calculateFunction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("put 'a' value");
        double a = Double.parseDouble(reader.readLine());

        System.out.println("put 'b' value");
        double b = Double.parseDouble(reader.readLine());

        System.out.println("put 'c' value");
        double c = Double.parseDouble(reader.readLine());
        reader.close();

        double result = (Math.sqrt(Math.pow(b,2) + 4*a*c) + b) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        return String.valueOf(result);
    }
}

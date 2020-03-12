package by.balashevich.gleb.task.task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("==== Task 13 ====");
        System.out.println("Result:" + calculateFunction());
    }

    public static String calculateFunction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("put 'x' value");
        double x = Double.parseDouble(reader.readLine());

        System.out.println("put 'y' value");
        double y = Double.parseDouble(reader.readLine());
        reader.close();

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);

        return String.valueOf(result);
    }
}

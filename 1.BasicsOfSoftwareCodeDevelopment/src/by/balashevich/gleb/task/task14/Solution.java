package by.balashevich.gleb.task.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("==== Task 14 ====");
        System.out.println("Result: " + calculateFunction());
    }

    public static String calculateFunction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("put 'R' value");
        double r = Double.parseDouble(reader.readLine());
        reader.close();

        String[] parts = String.valueOf(r).split("\\.");
        double result = Double.parseDouble(parts[1] + "." + parts[0]);

//      or variant without double values using
//
//      String[] result = reader.readLine().split("\\.");
//      return result[1] + "." + result[0];

        return String.valueOf(result);
    }
}

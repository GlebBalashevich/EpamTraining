package by.balashevich.gleb.task.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
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

        return String.valueOf(((a - 3) * b / 2) + c);
    }
}

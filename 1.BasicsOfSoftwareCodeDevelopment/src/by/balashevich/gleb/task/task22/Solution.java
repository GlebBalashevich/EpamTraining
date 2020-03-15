package by.balashevich.gleb.task.task22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("==== Task 22 ====");
        System.out.println("Result: " + calculateFunction());
    }

    public static String calculateFunction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Put positive Integer number");
        int x = Integer.parseInt(reader.readLine());
        reader.close();

        int result = 0;
        for(int i = 1; i < x; i++){
            result += i;
        }

        return String.valueOf(result);
    }
}

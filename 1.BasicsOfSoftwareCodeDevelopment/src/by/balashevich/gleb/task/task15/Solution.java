package by.balashevich.gleb.task.task15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("==== Task 15 ====");
        System.out.println("Result: " + calculateFunction());
    }

    public static String calculateFunction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("put 'T' value");
        int t = Integer.parseInt(reader.readLine());
        reader.close();

        String hours = String.valueOf(t / 3600);
        t = t % 3600;
        String minutes = String.valueOf(t / 60);
        String seconds = String.valueOf(t % 60);


        return hours + "ч " + minutes + "мин " + seconds + "с.";
    }
}

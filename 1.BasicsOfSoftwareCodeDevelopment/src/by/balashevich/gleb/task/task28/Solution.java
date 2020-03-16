package by.balashevich.gleb.task.task28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("==== Task 28 ====");
        calculateFunction();
    }

    public static void calculateFunction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Put m number");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Put n number");
        int n = Integer.parseInt(reader.readLine());
        reader.close();

        for (int i = m; i <= n; i++){
            System.out.print(i + " dividers: ");
            for(int j = m-1; j > 1; j--){
                if (i %j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

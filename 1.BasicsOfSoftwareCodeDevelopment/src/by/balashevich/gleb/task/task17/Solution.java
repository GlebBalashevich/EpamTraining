package by.balashevich.gleb.task.task17;

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

        System.out.println("put First angle value");
        int firstAngle = Integer.parseInt(reader.readLine());
        System.out.println("put Second angle value");
        int secondAngle = Integer.parseInt(reader.readLine());
        reader.close();

        StringBuilder sb = new StringBuilder();
        sb.append("The triangle is ");

        if (firstAngle + secondAngle < 180) {
            sb.append("exist. The triangle is ");
            if (firstAngle == 90 || secondAngle == 90 || firstAngle + secondAngle == 90) {
                sb.append("rectangular");
            }
            else{
                sb.append("not rectangular");
            }
        }
        else{
            sb.append("not exist");
        }
        return sb.toString();
    }
}

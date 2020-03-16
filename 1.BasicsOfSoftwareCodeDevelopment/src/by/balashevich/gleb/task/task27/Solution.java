package by.balashevich.gleb.task.task27;

public class Solution {
    public static void main(String[] args) {
        System.out.println("==== Task 27 ====");
        calculateFunction();
    }

    public static void calculateFunction() {
        for (int i = 33; i <= 256; i++) {
            System.out.println((char) i + " " + i);
        }
    }
}

package by.balashevich.gleb.task.task18;

public class Solution {
    public static void main(String[] args) {
        int a = 8;
        int b = 17;
        int c = 3;
        int d = 6;

        int max = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(max);
    }
}

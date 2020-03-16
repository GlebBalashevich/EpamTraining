package by.balashevich.gleb.task.task25;

public class Solution {
    public static void main(String[] args){
        System.out.println("==== Task 25 ====");
        System.out.println("Result: " + calculateFunction());
    }

    public static String calculateFunction(){
        long result = 1;

        for(int i = 1; i <= 200; i++){
            result *= Math.pow(i, 2);

        }

        return String.valueOf(result);
    }
}

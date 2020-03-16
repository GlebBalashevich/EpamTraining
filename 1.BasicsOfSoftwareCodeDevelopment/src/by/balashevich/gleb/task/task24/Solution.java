package by.balashevich.gleb.task.task24;


public class Solution {
    public static void main(String[] args){
        System.out.println("==== Task 24 ====");
        System.out.println("Result: " + calculateFunction());
    }

    public static String calculateFunction(){
        int result = 0;

        for(int i = 1; i <= 100; i++){
            result += Math.pow(i, 2);
        }

        return String.valueOf(result);
    }
}

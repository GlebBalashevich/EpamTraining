package by.balashevich.gleb.task.task101;

public class Solution {
    public static void main(String[] args) {
        System.out.println("======= TASK 101 =======");
        calculateFunction();
    }

    public static void calculateFunction(){
        int divisor = 3;
        int n = 15;
        int result = 0;
        int[] numbers = new int[n];


        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100);
            System.out.println("Index: " + i + " || Value: " + numbers[i]);
        }

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % divisor == 0){
                result += numbers[i];
                System.out.println("Index: " + i + " || Value: " + numbers[i] + " Result: " + result);
            }
        }
    }
}

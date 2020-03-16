package by.balashevich.gleb.task.task23;


public class Solution {
    public static void main(String[] args){
        System.out.println("==== Task 23 ====");
        calculateFunction();
    }

    public static void calculateFunction(){
        int start = -17;
        int end = 38;
        int step = 2;

        for(int i = start; i <= end; i += step){
            int coef = 1;
            if (i <= 2){
                coef *= -1;
            }
            System.out.println("x:" + i + " y:" + i * coef);
        }
    }
}

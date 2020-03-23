package by.balashevich.gleb.task.task102;

public class Solution {
    public static void main(String[] args) {
        System.out.println("======= TASK 102 =======");
        calculateFunction();
    }

    public static void calculateFunction() {
        int maximum = 12;
        double[] numbers = {3, 25, 48.7, -24, 1245, 0, 1.75, -295, -13243, 4824, 12, 9, -412.643};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Index: " + i + " || Old Value: " + numbers[i]);
            if (numbers[i] > maximum) {
                numbers[i] = maximum;
            }
            System.out.println(" || New Value: " + numbers[i]);
        }
    }
}

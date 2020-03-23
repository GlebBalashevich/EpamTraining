package by.balashevich.gleb.task.task104;

public class Solution {
    public static void main(String[] args) {
        System.out.println("======= TASK 104 =======");
        calculateFunction();
    }

    public static void calculateFunction() {
        int maximumIndex = 0;
        int minimumIndex = 0;
        double glassNumber;
        double[] numbers = {62546, 25, 48.7, -24, 1245, 0, 1.75, -295, -13243, 4824, 12, 9, -4145462.643};

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[minimumIndex] < numbers[i + 1]) {
                minimumIndex = i + 1;
            }
            if (numbers[maximumIndex] > numbers[i + 1]) {
                maximumIndex = i + 1;
            }
        }

        for (double number : numbers) {
            System.out.print(number + " || ");
        }
        System.out.println();
        glassNumber = numbers[maximumIndex];
        numbers[maximumIndex] = numbers[minimumIndex];
        numbers[minimumIndex] = glassNumber;

        for (double number : numbers) {
            System.out.print(number + " || ");
        }
    }
}

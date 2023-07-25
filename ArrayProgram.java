package training;

public class ArrayProgram {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Accessing array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Modifying array elements
        numbers[2] = 10;
        System.out.println("Modified array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Summing array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);

        // Finding the maximum element
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
}

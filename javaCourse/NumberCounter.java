package javaCourse;

import java.util.HashMap;
import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");
        int[] numbers = new int[numberStrings.length];

        // Convert the input strings to integers
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }

        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();


        // Loop through the array and count each number
        for (int i = 0; i < numbers.length; i++) {
            if (counts.containsKey(numbers[i])) {
                counts.put(numbers[i], counts.get(numbers[i]) + 1);
            } else {
                counts.put(numbers[i], 1);
            }
        }

        // Print the results
        for (Integer key : counts.keySet()) {
            System.out.println(key + " occurs " + counts.get(key) + " times");
        }
    }
}

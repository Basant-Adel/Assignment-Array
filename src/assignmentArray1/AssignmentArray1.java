package assignmentArray1;

import java.util.Arrays;

public class AssignmentArray1 {
    public static void main (String[] args){

        int[] scores = {85, 92, 78, 96, 88};
        System.out.println("Array of test scores : " + Arrays.toString(scores));

        // 1. Find the maximum score
        int max = scores[0];

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }

        System.out.println("The maximum score is : " + max);

        // 2. Calculate and print the sum and average
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        System.out.println("The sum of scores is : " + sum);
        System.out.printf("The average score is : %.2f%n", average);

        // 3. Search for a specific value and print its index
        int searchValue = 92;
        int foundIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == searchValue) {
                foundIndex = i;
                break;
            }
        }

        // 4. Show result of search
        if (foundIndex != -1) {
            System.out.println("The value " + searchValue + " is found at index : " + foundIndex);
        } else {
            System.out.println("The value " + searchValue + " was not found in the array.");
        }
    }
}

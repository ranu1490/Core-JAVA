package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //sum
        int sum = Arrays.stream(arr).reduce(0, (a, b) -> (a + b));

        //average
        double average = Arrays.stream(arr).average().orElse(0.0);

        System.out.println("Sum = "+ sum + " average = "+ average);
    }
}

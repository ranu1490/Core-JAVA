package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray {
    public static void main(String[] args) {
        int[] arr1 = {3,4,1,2,5};
        int[] arr2 = {7,4,5,9,3,2};

        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().forEach(n -> System.out.println(n));
    }
}

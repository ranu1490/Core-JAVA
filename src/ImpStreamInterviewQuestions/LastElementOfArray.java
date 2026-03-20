package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.OptionalInt;

public class LastElementOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int first = Arrays.stream(arr).skip(arr.length-1).findFirst().orElse(0);
        System.out.println(first);
    }
}

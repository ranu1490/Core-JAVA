package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,3,4,2};
        Map<Integer, Long> collect = Arrays.stream(arr).mapToObj(i -> (int) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}

package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOf5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,1,3,8,9);
        List<Integer> collect = list.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}

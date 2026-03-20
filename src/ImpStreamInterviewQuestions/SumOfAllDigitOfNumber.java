package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigitOfNumber {
    public static void main(String[] args) {
        int num = 123456;
        Integer collect = Arrays.stream(String.valueOf(num).split("")).collect(Collectors.summingInt(i -> Integer.parseInt(i)));
        System.out.println(collect);
    }
}

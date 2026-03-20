package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInReverseOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,1,3,8,9);
        List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }
}

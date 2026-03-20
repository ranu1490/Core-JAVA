package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(3,4,5,6);

        List<Integer> collect = list1.stream().filter(i -> list2.contains(i)).collect(Collectors.toList());
        System.out.println(collect);
    }
}

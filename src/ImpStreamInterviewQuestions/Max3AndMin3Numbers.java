package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Max3AndMin3Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,1,5,6,4);
        List<Integer> max = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("Max 3 "+ max);

        List<Integer> min = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("Min 3 "+ min);
    }
}

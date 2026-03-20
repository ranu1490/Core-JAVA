package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStringLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ranu","Anu","Shashank","Ravish","Sweta","mmy","Papa","Tanku");
        List<String> collect = list.stream().sorted(Comparator.comparing(n -> n.length())).collect(Collectors.toList());

        System.out.println(collect);
    }
}

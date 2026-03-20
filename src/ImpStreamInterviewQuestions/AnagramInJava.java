package ImpStreamInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AnagramInJava {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        s1 = Arrays.stream(s1.split("")).sorted().collect(Collectors.joining());

        s2 = Arrays.stream(s2.split("")).sorted().collect(Collectors.joining());

        System.out.println("S1 = "+s1 + " s2 = "+s2 );

    }
}

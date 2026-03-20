package ImpStreamInterviewQuestions;

import java.util.stream.IntStream;

public class PallindromeInJava8 {
    public static void main(String[] args) {
        String s = "ranu";
        boolean b = IntStream.range(0, s.length() / 2).allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
        System.out.println(b);

        //reverse string
        IntStream.rangeClosed(1, s.length()).map(i -> s.charAt(s.length() - i)).forEach(i-> System.out.println((char)i));

    }
}

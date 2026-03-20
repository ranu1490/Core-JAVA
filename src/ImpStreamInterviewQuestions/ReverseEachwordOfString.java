package ImpStreamInterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachwordOfString {
    public static void main(String[] args) {
        String str = "Ranu is a good girl";
        List<StringBuilder> collect = Arrays.stream(str.split(" ")).
                map(word -> new StringBuilder(word).reverse()).
                collect(Collectors.toList());
        System.out.println(collect);
    }
}

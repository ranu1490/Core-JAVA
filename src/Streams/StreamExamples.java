package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExamples {

    public static void main(String[] args) {

        //1. seperate odd and even numbers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> evenOdd = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("even: " + evenOdd.get(true));
        System.out.println("odd: " + evenOdd.get(false));

        //2. Frequency of each character in a string
        String s = "SWISS";
        Map<Character, Long> collect = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //3 sort list in reverse order
        List<Integer> list1 = Arrays.asList(3, 2, 5, 0, 2, 8, 8, 3);
        List<Integer> collect1 = list1.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
        System.out.println(collect1);

        //4. print multiples of 5
        List<Integer> collect2 = list1.stream().filter(x -> x % 5 == 0).collect(Collectors.toList());
        System.out.println(collect2);

        //5. merge two unsorted array in a sorted array
        int[] num1 = {1, 0, 5, 6, 3, 8};
        int[] num2 = {6, 8, 3, 2, 0, 9};
        IntStream.concat(Arrays.stream(num1), Arrays.stream(num2)).distinct().sorted().forEach(System.out::println);

        //6. Find 3rd largest number
        Integer i = list1.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().get();
        System.out.println("third largest: " + i);

        //7. Find 3rd minimum number
        Integer i1 = list1.stream().sorted().distinct().skip(2).findFirst().get();
        System.out.println("third Minimum: " + i1);

        //8.
        List<String> list2 = Arrays.asList("Ankita", "Akshay", "Ranu");
        list2.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        //9. sum and average of array
        int sum = Arrays.stream(num1).sum();
        System.out.println(sum);
        OptionalDouble average = Arrays.stream(num1).average();
        System.out.println(average.getAsDouble());

//        Arrays.stream(num1).collect(Collectors.)


        int number = 12345;

        Long sum1 = String.valueOf(number)         // Convert to string: "12345"
                .chars()                      // Stream of character codes
                .mapToLong(c -> c - '0')            // Convert char '1' to int 1, etc.
                .sum();                       // Sum the digits

        System.out.println("Sum of digits: " + sum1); // Output: 15

        String[] sty = {"Ranu", "Kumari"};
        String yui = "Ranu Kumari";
        String collect3 = Arrays.stream(yui.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(  " "));
        System.out.println(collect3);

    }

}

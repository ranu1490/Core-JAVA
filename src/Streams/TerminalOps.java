package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);

        //1. collect
        System.out.println(list.stream().map(x->x+1).collect(Collectors.toList()));

        //2. forEach
        list.stream().forEach(System.out::println);

        //3. reduce: combines element to produce a single result
        Optional<Integer> optionalI =list.stream().reduce((x, y)->x+y);
        System.out.println(optionalI.get());

        //4. count
        System.out.println(Stream.iterate(1,x->x+1).limit(20).count());

        //5. anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x->x%2==0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x->x%2==0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x->x%2==0);
        System.out.println(b2);

        //6. findFirst, findAny
        System.out.println(list.stream().findAny().get());
        System.out.println(list.stream().findFirst().get());

        //7. toArray()
        Object[] array = Stream.of(1,2,3).toArray();

        //8. min/max()
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        System.out.println(max.get());

        Optional<Integer> min1 = list.stream().min(Comparator.naturalOrder());
        System.out.println(min1.get());
        Optional<Integer> max1 = list.stream().max(Comparator.naturalOrder());
        System.out.println(max1.get());

        // 9. forEachOrdered
        List<Integer> numbers0 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using forEach with parallel stream:");
        numbers0.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with parallel stream:");
        numbers0.parallelStream().forEachOrdered(System.out::println);

        // Streams cannot be reused after a terminal operation has been called
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
//        List<String> list1 = stream.map(String::toUpperCase).toList(); // exception

    }

}

package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOpsStreams {
    public static void main(String[] args) {
        //Transforms stream into another stream
        //they are lazy means they don't execute until a terminal operation is invoked

        List<String> list = Arrays.asList("Ram","Sita","Rita");

//    1. filter
        Stream<String> filteredStream = list.stream().filter(x->x.startsWith("a"));

//    2. map
        Stream<String> mappedStream = list.stream().map(String::toLowerCase);

//    3. sorted
        Stream<String> sorttedStream = list.stream().sorted();//natural order sorting
        Stream<String> sorttedStreamComparator = list.stream().sorted((x,y)->x.length()-y.length());//natural order sorting

//    4. distinct
        System.out.println(list.stream().distinct().count());

//        5. limit
        System.out.println(Stream.generate(()->1).limit(10).collect(Collectors.toList()));

//        6. skip
        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).collect(Collectors.toList()));

//        7. peek -> perform an action on each element as it is consumed
        List<Integer> result = Stream.iterate(1,x->x+1).limit(10).peek(System.out::println).collect(Collectors.toList());
        System.out.println(result);

        // 8. flatMap
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).collect(Collectors.toList()));
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        System.out.println(sentences
                .stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .collect(Collectors.toList()));


    }


}

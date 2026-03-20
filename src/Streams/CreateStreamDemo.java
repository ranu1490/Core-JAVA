package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamDemo {
//    How to use?
//    Source->change to stream -> intermediate operation -> Terminal Operations

    //Creating stream
    //1. From Collection
    List<Integer> list =Arrays.asList(1,2,3,4,5,6);
    Stream<Integer> str = list.stream();

    //2.From Arrays
    String[] array ={"a","b","c"};
    Stream<String> stream1= Arrays.stream(array);

    //3.Using Stream.of()
    Stream<String> stream2= Stream.of("a","b","c");

    //4.Infinaite Streams
    Stream<Integer> generate = Stream.generate(()->1).limit(10);
    Stream<Integer> generate2 =  Stream.iterate(1,x->x+1);
}

package Streams;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {

        //Lambda Expression -> it is an anonymous function (no name, no return type, no access modifier)
        MathOperation sum = (a,b)->a+b;
        int res = sum.operate(3,4);
        System.out.println(res);

        //Predicate --> Functional interface(Boolean valued function)
        Predicate<Integer> p = n->n%2==0;
        System.out.println("p.test(): "+p.test(10));
        Predicate<String> str = x->x.toLowerCase().startsWith("a");
        Predicate<String> str1 = x->x.toLowerCase().endsWith("t");
        Predicate<String> and = str.and(str1);
        System.out.println("and.test(): "+and.test("Ankita"));

        //Function --> work for you - Functional interface(one input and one return)
        Function<Integer,Integer> doubleIt= x->2*x;
        Function<Integer,Integer> tripleIt= x->3*x;
        Function<Integer,Integer> doubleTriple = doubleIt.andThen(tripleIt);
        System.out.println(doubleTriple.apply(6));
        Function<Integer,Integer> tripleDouble = doubleIt.compose(tripleIt);
        System.out.println(tripleDouble.apply(6));
        Function<Integer,Integer> identity = Function.identity();
        Integer res1 = identity.apply(6);
        System.out.println(res1);

        //consumer -> consumes only(one input no return)
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<List<Integer>> printList = x->{
            for(int i:x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        //supplier --> no input only return
        Supplier<String> s = () -> "Hello World";
        System.out.println(s.get());

        //    BiPredicate, BiConsumer, BiFunction

        //Method Reference -> use method without invoking & in place of lambda expression
        List<String> list1 = Arrays.asList("Ram", "Shyam", "Sita");
        list1.forEach(System.out::println);

        //Constructor Reference
        List<String> mobile = Arrays.asList("A", "B", "C");
        List<ConstructorRefExampl> collect = mobile.stream().map(ConstructorRefExampl::new).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


}

class ConstructorRefExampl{
    String name;

    ConstructorRefExampl(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "ConstructorRefExampl{" +
                "name='" + name + '\'' +
                '}';
    }
}

interface MathOperation{
    int operate(int a, int b);
}

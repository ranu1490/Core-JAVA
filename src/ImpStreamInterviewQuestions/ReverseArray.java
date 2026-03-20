package ImpStreamInterviewQuestions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] array = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
        for(int num : array){
            System.out.println(num);
        }
    }
}

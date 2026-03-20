import java.util.function.Function;

public class LambdaExp {

    public static void main(String[] args) {
        Runnable r = ()->{
            System.out.println("Hello");
        };
        r.run();

        Function<String, Integer> getStringLength = (String str) -> {
            return str.length();
        };

        int length = getStringLength.apply("Hello");
        System.out.println("Length: " + length); // Prints: Length: 5
    }
}

import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Paul", "George", "Ringo");

        // Sorting using a lambda expression
        Collections.sort(names, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(names);
    }
}

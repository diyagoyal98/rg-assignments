import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "bob", "diana");

        // Using a lambda expression
        List<String> upperCaseNames = names.stream()
                                           .map(name -> name.toUpperCase())
                                           .collect(Collectors.toList());

        System.out.println(upperCaseNames);
    }
}

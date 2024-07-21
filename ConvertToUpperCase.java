import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        // Convert each string to uppercase using the map method
        List<String> upperCaseStrings = strings.stream()
                                                .map(String::toUpperCase)
                                                .collect(Collectors.toList());

        // Print the results
        System.out.println("Original List: " + strings);
        System.out.println("Uppercase List: " + upperCaseStrings);
    }
}

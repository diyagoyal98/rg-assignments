import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        
        Optional<String> nonEmptyOptional = Optional.of("Hello, World!");

        
        String str = null;
        Optional<String> emptyOptional = Optional.ofNullable(str);

        
        if (nonEmptyOptional.isPresent()) {
            System.out.println(nonEmptyOptional.get()); 
        }

    
        nonEmptyOptional.ifPresent(System.out::println); 

        String defaultValue = emptyOptional.orElse("Default Value");
        System.out.println(defaultValue); 

        String value = emptyOptional.orElseGet(() -> "Generated Value");
        System.out.println(value); 
    }
}

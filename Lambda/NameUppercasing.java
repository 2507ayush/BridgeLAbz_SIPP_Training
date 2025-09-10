package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Alice", "Bob", "Charlie");

        // Convert all employee names to uppercase using method reference String::toUpperCase
        List<String> uppercasedNames = employeeNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercased employee names:");
        uppercasedNames.forEach(System.out::println);
    }
}

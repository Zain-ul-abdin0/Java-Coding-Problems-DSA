import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionAndStreams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Filtering elements using a predicate
        List<String> filteredNames = names.stream().filter(item-> item.startsWith("A")).collect(Collectors.toList());
        System.out.println("Filtered names: " + filteredNames);

        // Transforming elements using a function

        List<String> uppercaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase names: " + uppercaseNames);
    }
}

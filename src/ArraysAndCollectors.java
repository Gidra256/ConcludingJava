import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// An Array is a container object that holds a fixed number of values of a single type.

public class ArraysAndCollectors {
    public static void main(String[] args) {
        // Example of using Arrays and Collectors in Java
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Convert array to list
        List<String> nameList = Arrays.asList(names);
        System.out.println("Name List: " + nameList);

        // Collecting names into a single string

        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        String collectedNames = nameList.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Collected Names: " + collectedNames);
    }
}

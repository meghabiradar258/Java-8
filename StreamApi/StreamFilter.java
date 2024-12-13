package Task.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Megha", "jaya", "Anjali", "Minakshi", "Kavita","Ankita");

        names.stream()
                .filter(name -> name.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
    }
}

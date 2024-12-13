package Task.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 23, 33, 45, 5);

        Stream<Integer> numberStream = numbers.stream();

        numberStream.forEach(System.out::println);
    }
}

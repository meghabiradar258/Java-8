package Task.StreamApi;

import java.util.stream.Stream;

public class StreamLimit {

    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1).limit(100).forEach(System.out::println);
    }
}


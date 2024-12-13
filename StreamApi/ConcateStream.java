package Task.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcateStream {

    public static void main(String[] args) {
        List<String> course = Arrays.asList("MCA", "MBA", "BBA","BCA");
        List<String> names = Arrays.asList("MEGHA", "ANKITA", "JANVI");

        Stream<String> combinedStream = Stream.concat(course.stream(), names.stream());

        combinedStream.forEach(System.out::println);
    }
}


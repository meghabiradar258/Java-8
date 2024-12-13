package Task.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamGroupEx {

    public static void main(String[] args) {


        List<String> animals = Arrays.asList("dog", "cat", "elephant", "dog", "cow", "cat");
        Map<String, Long> animalscount = animals.stream().collect(groupingBy(animal -> animal, counting()));
        System.out.println(animalscount);

        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "banana", "apple");

        Map<String, Long> fruitscount = fruits.stream().collect(groupingBy(item -> item, counting()));

        System.out.println(fruitscount);
    }
}

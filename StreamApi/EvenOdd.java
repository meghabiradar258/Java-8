package Task.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(11, 2, 3, 41, 5, 60, 7, 87, 9);
        Map<Boolean, List<Integer>> partitioningBynum = num.stream().
                collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partitioningBynum );
    }
}

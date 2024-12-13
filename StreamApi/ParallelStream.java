package Task.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            num.add(i);
        }
        int sum = num.parallelStream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}

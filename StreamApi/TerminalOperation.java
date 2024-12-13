package Task.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperation {

        public static void main(String[] args) {
            List<Integer> num = Arrays.asList(1, 2, 3, 4, 5,8);

            List<Integer> squarnum = num.stream().map(n -> n * n).collect(Collectors.toList());

            System.out.println(squarnum);
        }
    }

package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class ExceptionExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("color", "college",null, "Bank");

        // Using method reference to handle NullPointerException
        list.forEach(item -> {
            try {
                System.out.println(item.length());
            } catch (NullPointerException e) {
                System.out.println("wrong value");
            }
        });
    }
}


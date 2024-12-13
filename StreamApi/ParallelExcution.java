package Task.StreamApi;

import java.util.Arrays;
import java.util.List;

public class ParallelExcution {


    public static void main(String[] args) {

        List<String> name = Arrays.asList("Megha","jayaSonatkke","Gayatri","Sonali","Anikita","Danashriree","MeghaBiradar");

        System.out.println("Normal Stream Execution");
        name.stream().filter(names -> names.length() > 6).skip(2).forEach(System.out::println);

        // Parallel Stream Execution
        System.out.println("Parallel Stream Execution");
        name.parallelStream().filter(names -> names.length() > 6).skip(2).forEach(System.out::println);
    }
}

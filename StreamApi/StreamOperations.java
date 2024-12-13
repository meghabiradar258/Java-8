package Task.StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        //Empty Stream
        Stream<String> emptyStream = Stream.empty();
        System.out.println("Count of elements in empty stream " + emptyStream.count());


        //single Element Stream
        Stream<String> singleElementStream = Stream.of("Megha");
        System.out.println("Count of elements in single element stream " + singleElementStream.count());

          //Multiple Element Stream
        Stream<String> ElementStream = Stream.of("Megha","Biradar","janvi","shree");
        System.out.println("Count of elements in  stream " + ElementStream.count());

            //Creating Stream From Collection
        List<String> names= Arrays.asList("Kavita","Sayali","Megha","Biradar","janvi","shree");
        names.stream().forEach(System.out::println);

        //Select Distinct Element
        List<Integer> values= Arrays.asList(11,22,55,11,63,44,22);
        values.stream().distinct().forEach(System.out::println);

        //sum of the lengths of all names
        List<String> name= Arrays.asList("Kavita","Sayali","Megha","Biradar","janvi","shree");
        int totallength=name.stream().mapToInt(String::length).sum();
        System.out.println(" sum of the lengths of all names " + totallength);

        // Sort names alphabetically
        List<String> namess= Arrays.asList("Kavita","Sayali","Megha","Biradar","janvi","shree");
        names.stream().sorted().forEach(System.out::println);

        // Finding the minimum
        OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();
        System.out.println(min);

        List<Integer> numb = Arrays.asList(1,2,5,8,9,4,3,22);
        int min1 = numb.stream().min(Integer::compareTo).orElse(-1);
        System.out.println("Min " + min1);

        // Finding the max element

        OptionalInt max = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).max();
        System.out.println(max);

        List<Integer> numb1 = Arrays.asList(1,2,5,8,9,4,3,22);
        int max1=numb1.stream().max(Integer::compareTo).orElse(-1);
        System.out.println(max1);


        //allMatch() : All elements matches This method returns true
        // if all the elements of a stream matches with given predicate.
        // Otherwise returns false.
        List<String> sname= Arrays.asList("Kavita","Sayali","Megha","Biradar","janvi","shree");
        if(sname.stream().allMatch((String n) -> n.length() > 5))
        {
            System.out.println("all names grater than 5");
        }else {
            System.out.println("all names not grater than 5");
        }
          //noneMatch() : No element matches

        if(sname.stream().noneMatch((String n) -> n.length() ==2))

        {
            System.out.println("all names are not equal to 2");
        }
        else {
            System.out.println("all names are  equal to 2");
        }

          //Finding first element
        Optional<String> a=Stream.of("vadapav","buragar","Pizza").findFirst();
        System.out.println(a);

        //Finding any element
        Optional <String> b=Stream.of("vadapav" ,"buragar","Pizza").findAny();
        System.out.println(b);


        //Stream to Array
        List<String> sirname= Arrays.asList("kale","Sontakke","Jadhav","Biradar","zeri");
        Object[] arr= sirname.toArray();
        System.out.println(Arrays.toString(arr));

    //Second Largest num
        List<Integer> n = Arrays.asList(1,2,5,8,9,4,3,22);
       int secondlargest= n.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second largest  "+ secondlargest);

        //Given a list of strings, sort them according to increasing order of their length

        List<String> sirnames= Arrays.asList("kale","Sontakke","Jadhav","Biradar","zeri");
        sirnames.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

// Given an integer array, find sum and average of all elements
       int arr1[] =new int [] {12,20,55,63,45,10};
      int sum = Arrays.stream(arr1).sum();
        System.out.println(sum);

        double average =Arrays.stream(arr1).average().getAsDouble();
        System.out.println(average);


//How do you find common elements between two arrays
        List<Integer> list1= Arrays.asList(10,20,55,53,63,88,78);
        List<Integer> list2=Arrays.asList(22,53,10,66,63,88,78);
        list1.stream().filter(list2::contains).forEach(System.out::println);

//How do you find sum of first 10 natural numbers
        int sumnaturalnum= IntStream.range(1,11).sum();
        System.out.println(sumnaturalnum +" sum Of natural number ");



// Print first 10 even numbers
        System.out.println("irst 10 even numbers");
       IntStream.rangeClosed(1,11).map(i -> i*2)
                .forEach(System.out::println);



       //How do you get three maximum numbers and three minimum numbers from the given list of integers
        List<Integer> l1=Arrays.asList(1,4,5,2,3,8,9,12,15);
        System.out.println("three maximum numbers");
        l1.stream().limit(3).forEach(System.out::println);
        System.out.println("three minimum numbers");
        l1.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

       //Find sum of all digits of a number in Java 8
        int x=26585;
        int sumofdigit=Stream.of(String.valueOf(x).split(" ")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumofdigit);

       // How do you find frequency of each character in a string using Java 8 streams
        String inputString = "Megha Prabhatrao Biradar";

        Map<Character, Long> charCountMap =
                inputString.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

                System.out.println(charCountMap);



    }

}
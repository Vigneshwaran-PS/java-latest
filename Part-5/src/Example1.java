import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example1 {

    public static void main(String[] args) {

        int[] arr = new int[]{34,6,7,12,36,9,32,43,7,9,3,8,4};

        Arrays
                .stream(arr)
                .sorted()
                .forEach(number -> System.out.println(number));


        System.out.println(Arrays
                .stream(arr)
                .sorted()
                .sum());


        System.out.println(Arrays
                .stream(arr)
                .sorted()
                .max().getAsInt());


        System.out.println("-----------------------------------");

        Arrays.stream(arr)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);


    }
}

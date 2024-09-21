import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        
        Function<String,Integer> function = number -> number.length();

        System.out.println(function.apply("viki"));


    }
}


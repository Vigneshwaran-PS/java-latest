// import java.util.function.*;;

// public class PredicateExample {
    

//     public static void main(String[] args) {
//         Predicate<Integer> p = (a)->{
//             return a>18;
//         };

//         System.out.println(p.test(10));
//     }
// }

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;;

public class PredicateExample {
    

    public static void main(String[] args) {
        
        Predicate<Integer> p1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number){
                return number > 10;
            }
        };
        
        Predicate<Integer> p2 = number -> number%2 == 0;

        int[] arr = new int[]{3,7,6,83,23,65};

        // check(p1,arr);
        // check(p2,arr);
        check(p1.negate(),arr);
        check(p1.and(p2),arr);
        check(p1.or(p2),arr);
    }

    private static void check(Predicate<Integer> p1, int[] arr) {
        
        for(int a : arr){
            System.out.println(p1.test(a));
        }
    }
}



class Demo1{

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); 
        list.add("a");
        list.add("");
        list.add("abc");

        Predicate<String> predicate =  str ->{
            return str.length() > 0;
        };


        for(String str : list){
            System.out.println(predicate.test(str));
        }
    }
}



/**
 * 
 * Also we can implement the predicate interface
 */
class Demo2 implements Predicate{

    @Override
    public boolean test(Object t) {
        return Objects.nonNull(t);
    }

}



class Demo3{

    public static void main(String[] args) {
        Predicate<Integer> p = number->{
            return number > 10;
        };


        Predicate<Integer> p1 = number->{
            return number % 2 == 0;
        };


        check(p , 11);
    }

    private static void check(Predicate<Integer> p, int i) {
        
        System.out.println(p.test(i));
    }
}



class Demo4{

    public static void main(String[] args) {
        Predicate<Integer> p = number->{
            return number > 10;
        };


        Predicate<Integer> p1 = number->{
            return number % 2 == 0;
        };


        check(p1.negate(), 11);
        check(p1.and(p), 12);
    }

    private static void check(Predicate<Integer> p, int i) {
        
        System.out.println(p.test(i));
    
    }
}


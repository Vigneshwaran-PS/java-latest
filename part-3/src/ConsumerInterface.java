import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String args) {
        
        List<String> strList = new ArrayList<>();
        strList.add("viki");
        strList.add("joy");        


        Consumer<List> lConsumer = (list)->{
            for(int i=0 ; i<list.size() ; i++){
                    System.out.println(list.get(i));
            }
        };


        lConsumer.accept(strList);



        List<Integer> list2 = Arrays.asList(23,25,7,4,21,9,65,31);
        Consumer<Integer> consumer2 = number -> System.out.println(number);
        list2.forEach(consumer2);

    }
    
}




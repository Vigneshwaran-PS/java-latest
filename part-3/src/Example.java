import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example {

    
    public void sample(Integer i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Example example = new Example();
    

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(example::sample);

    
    }

}


interface A1{

    void display(Integer i);

}

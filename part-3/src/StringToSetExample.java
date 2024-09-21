import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringToSetExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("123,456,789");
        strings.add("abc,def,ghi");

        Set<String> set = new HashSet<>();
        for(String data : strings){
            set.add(Arrays.toString(data.split(",")));
        }

        System.out.println(set);
    }
}

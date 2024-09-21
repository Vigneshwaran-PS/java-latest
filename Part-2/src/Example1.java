public class Example1 {
    
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public String display(String s){
                return s.concat(" hi");
            }
        };

        display(a.modify());
    }


    public static void display(A a){
            System.out.println(a.display("Viki"));
    }
}


interface A{

    String display(String str);

    default A modify(){
        return (s)->
            display(s) + "bye";
    }
}

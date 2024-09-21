
/*
 *   Assigning exsiting non static method to the interface reference for overriding abstract method\
 * 
 *   Without argument and retuern type
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DoubleColon {

    void sample(){
        System.out.println("Heloo");
    }

    
    public static void main(String[] args) {
        
        DoubleColon doubleColon = new DoubleColon();
        // A a = doubleColon::sample;
        A a = () -> doubleColon.sample();
        a.display();
        
    }
}

interface A{

    void display();
}





/*
 *   Assigning exsiting non static method to the interface reference for overriding abstract method\
 * 
 *   With argument and retuern type
 */
class Main {

    public String getString(String str){
        return str;
    }

    public static void main(String[] args) {
        Main m = new Main();

        B b =(str)->m.getString(str);
        B b1 =m::getString;
        b.display("viki");
    }   

}


interface B{

    String display(String str);

}




/*
 *   Assigning exsiting static method to the interface reference for overriding abstract method\
 * 
 *   With argument and retuern type
 */

 interface C{

    String display(String str);

 }


 class Sample{


    public static String dummy(String str){
        return str;
    }

    public static void main(String[] args) {
        C c =  Sample::dummy;

        c.display("viki");
    }
 }




 
/*
 *   Assigning constructor to the interface reference for overriding abstract method
 * 
 *   Without argument and retuern type
 */

interface D {

        void display();
}


class Dummy{

    String str = "HI";

    Dummy(){
        System.out.println(str);
    }


    public static void main(String[] args) {
        D d  = Dummy::new;
        D d1  = ()-> new Dummy();
        d.display();
    }
}




/*
 *   Assigning exsiting static method to the interface reference for overriding abstract method\
 * 
 *   With argument and retuern type
 */

interface exsiting {

    void display();
}


class Example{

    String str = "HI";

    Example(){
        System.out.println(str);
    }


    public static void main(String[] args) {
        D d  = Dummy::new;
        d.display();
    }
}



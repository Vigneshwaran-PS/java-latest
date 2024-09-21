 class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Child1 child = new Child1();
        child.display();

        Parent1 parent = new Child1();
        parent.display();


        Parent2 parent2 = ()->{
            return "Lambda Function";
        };

        System.out.println(parent2.display());


        Parent2 parent21 = new Parent2() {
            @Override
            public String display() {
                return "Thread like example";
            }
        };


        Child1 child1 = new Child1()
        {
            @Override
            public void display(){
                System.out.println("Bye");
            }
        };

        child1.display();


        // Thread t = new Thread(
        //     ()->{
        //         System.out.println("Hi");
        //     }
        // );

        // t.run();


        // Thread t = new Thread(){
        //     @Override
        //     public void run(){
        //         System.out.println("Hi");
        //     };
        // };

        // t.start();


        Runnable r = ()->{
            System.out.println("Hi");
        };

        Thread t = new Thread(r);
        t.start();

    }
}


/**
 * Just an interface with one abstract method
 */
interface Parent1 {

    void display();
    
}



/**
 * Just a child class implements Parent class
 */
class Child1 implements Parent1 {
    
    Child1(){
        
    }

    @Override
    public void display() {
        System.out.println("Child class called");
    }


}


@FunctionalInterface
interface Parent2{

    public String display();

    public static void test1(){

    }

    public default void test2(){

    }
}





interface InterfaceWithdefaultMethod {

    default void display(){
        System.out.println("Interface Default Method");
    
    }
    
}



public class App implements InterfaceWithdefaultMethod{
 
    public static void main(String arp[]){
        App app = new App();
        app.display();
    }
    
}

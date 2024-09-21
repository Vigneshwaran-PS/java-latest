public class SpringBootWorkingFlow {

    private Service service;

    SpringBootWorkingFlow(Service service){
        this.service = service;
    }

    public void sample(){
        System.out.println(service.display("viki"));
    }


    public static void main(String[] args) {
        Service service1 = new ServiceImpl();
        SpringBootWorkingFlow s = new SpringBootWorkingFlow(service1);
        s.sample();
    }

}


interface Service{

    String display(String name);

}

class ServiceImpl implements Service{


    @Override
    public String display(String name) {
        return name;
    }
}

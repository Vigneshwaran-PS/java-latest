interface SprinBoot {

        void springwork();
    
}


class A implements SprinBoot{

    @Override
    public void springwork() {
        System.out.println("THis is how spring works");
    }

}


class Main{

    private SprinBoot deleteSoon;

    Main(SprinBoot deleteSoon){
        this.deleteSoon = deleteSoon;
    }


    public void work(){
        deleteSoon.springwork();
    }

    public static void main(String[] args) {
        SprinBoot deleteSoon = new A();

        Main main = new Main(deleteSoon);
        main.work();

        

    }
}


class InnerSprinBoot {

    Main main = new Main(
        new SprinBoot() {
            @Override
            public void springwork(){
                System.out.println("Same Same");
            }
        }
    );

    Main main1 = new Main(
        ()->{
            System.out.println("Same Same Same");
        }
    );


    public static void main(String[] args) {
        InnerSprinBoot innerSprinBoot = new InnerSprinBoot();
        innerSprinBoot.main.work();
    }

        
    
}
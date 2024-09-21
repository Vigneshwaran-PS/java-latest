class ThreadLike {

    public static void main(String[] args) {
        Sample sample = new Sample(
            ()->{
                System.out.println("Hi");
            }
        );
        sample.display();
    }
    
}



interface InnerThreadLike {

    void display();
}


class Sample
{

    private InnerThreadLike innerThreadLike;

    public Sample(InnerThreadLike innerThreadLike) {
        this.innerThreadLike = innerThreadLike;
    }

    void display (){
        innerThreadLike.display();
    }
}



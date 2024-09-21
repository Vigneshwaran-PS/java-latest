class InterfaceContract implements Contract1,Contract2{


    @Override
    public int sum(int a , int b){
        return Contract1.super.sum(a, b);
        // return Contract2.super.sum(a, b);
    }

    public static void main(String[] args) {
        InterfaceContract contract = new InterfaceContract();
        System.out.println(contract.sum(10,20));
    }
}



interface Contract1 {

    default int sum(int a , int b){
        return a+b;
    }
}


interface Contract2 {
    default int sum(int a , int b){
        return a+b;
    }
}






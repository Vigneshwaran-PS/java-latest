public class EnumEx {
    public static void main(String[] args) {
        // Z a = Z.monday;
        // Z a1 = Z.friday;

        // System.out.println(a);
        // System.out.println(ZZ.a);
        // System.out.println(a1);
        // System.out.println(a.ordinal());
        System.out.println(Z.friday);
        System.out.println(Z.monday);
        System.out.println(Y.MONDAY.sample());
        System.out.println(Y.MONDAY.dummy());

    }
}


enum Z{

    monday,
    tuesday,
    wednesday,
    thursday,
    friday;

}



enum Y{

   
    MONDAY("1","DOSA");

    String string;
    String item;

    Y(String string , String item){
        this.string = string;
        this.item = item;
    }

    public String sample(){
        return string;
    }

    public String dummy(){
        return item;
    }
}



interface ZZ{
     String a = "divya";
}


package JavaArrays;

public class MainArrays {

    public static void main(String[] args){
        int[] sir1=new int[] {11,22,33,10,10};
                int[] sir2=new int[]{11,22,34,19,10};

        if (Arrays.compar2Siruri(sir1, sir2)) {
            System.out.println("Cele 2 siruri sunt egale.");
        } else {
            System.out.println("Cele 2 siruri nu sunt egale.");
    }
}}


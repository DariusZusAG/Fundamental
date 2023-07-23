import java.util.Arrays;
import java.util.Scanner;

public class Modul3 {
    public static void main(String[] args) {
/*
        String[] texte = new String[4];
        texte[0] = "this is a test;";
        texte[1] = "this is 2nd test";


        int[] duplicateArray = new int[]{20, 20, 30, 40, 50, 50, 50};
        gasesteDuplicate(duplicateArray);

        
        int[] duplicateArray2=new int[]{-3,1,2,10,50,40,50,2,1};
        gasesteDuplicate(duplicateArray2);
    }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu textul: ");
        String text = sc.nextLine();
        int rezultat = numarCuvinte(text);
        System.out.println(rezultat);
        System.out.println("Minimul este: " + compare3No(12, -3, 5));

        System.out.println("Media a 3 numere date este: " + media3No(10, 11, 12));}

    public static void gasesteDuplicate(int[] array){

      /*  int lungimeFaraDuplicate=1;
        Arrays.sort(array);
        for(int i=0;i<array.length-1;i++){
            if (array[i]!=array[i+1]){
                lungimeFaraDuplicate++;
            }
        }

        System.out.println(lungimeFaraDuplicate);*/
    }
        public static int compare3No(int n1, int n2, int n3){

            int min=n1;

            if (min>n2) {
                min=n2;
            }

            if (min>n3) {
                min=n3;
            }

            return min;

        }


        public static double media3No(int n1, int n2, int n3){

            return (n1 + n2 + n3)/3;

        }



    public static int numarCuvinte(String text){
        int numarCuvinte = 0;
        numarCuvinte = text.split(" ").length;
        return numarCuvinte;

    }

}

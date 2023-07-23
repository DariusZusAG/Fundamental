import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
     /*   int[] intArray = new int[10];
        intArray[0] = 2;
        intArray[1] = 4;
        intArray[2] = 6;

        System.out.println(intArray[0]);
        int suma = 0;
        for (int i = 0; i < intArray.length; i++) {
            suma = suma + intArray[i];

        }
        System.out.println(suma);
        int produs = 1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                intArray[i] = 1;
            }
            produs = produs * intArray[i];
        }
        *//* System.out.println(produs);*//*

        String[][] stringArray = new String[2][];
        stringArray[0] = new String[]{"Alice", "has", "the", "cat"};
        stringArray[1] = new String[]{"The", "cat", "has", "Alice"};

        System.out.println(stringArray[1][3]);
        int[][] matrice = new int[5][5];

        int contor = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j<matrice.length; j++) {
                matrice[i][j] = contor;
                contor++;
            }
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (j == 4) {
                    System.out.println(matrice[i][j]);
                } else {
                    System.out.println(matrice[i][j] + "             ");
                }*/
        /*int[] array = new int[]{25,4,31,15,6,0,2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


            int[] sir = new int[]{-3, 10, 11, 12, 55};
    int suma=0;
    int l = sir.length;

    for(int i=0; i<l; i++){
        suma+=sir[i];

        }
    System.out.println("Media numerelor din sir este: " + suma/l);

    }}

         */
    /*String[] array1= new String[]{"alb", "rosu", "bleo", "albastru"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Stringul cautat va fi: ");
        String culoare=sc.nextLine();

        int l= array1.length;
        boolean gasit=false;

        for(int i=0; i<l &&  gasit==false; i++){
            if(array1[i].equals(culoare)){
                gasit=true;
            }
        }

        if(gasit==true){
        System.out.println("S-a identificat" + culoare + "in stringul existent");
        }else {
            System.out.println("Nu s-a identificat" + culoare + "in stringul existent" );}*/

        /*int[] array = new int[]{5, 3, 21, 7, 2, 59};
                int min=array[0];
        int max=array[0];

        for(int i = 0; i < array.length; i++){

                if (array[i]>max){
                    max=array[1];
                }
                if (array[i]>min){
                    min=array[i];
                }
        }System.out.println("Minimul sirului este: " + min);
        System.out.println("Maximul sirului este: " + max);
        }*/


       /* int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        for (int i = 0; i<array1.length; i++){
            array2[i]=array1[array1.length-1-i];
        }
        for(int j = 0; j< array2.length; j++){
          System.out.println(array2[j]);
        }
*/
        // find duplicate
        /*int[] duplicateArray= new int[]{20,20,30,40,50,50,50};
        int lungimeFaraDuplicate=1;
        Arrays.sort(duplicateArray);
        for(int i=0;i<duplicateArray.length-1;i++){
            if (duplicateArray[i]!=duplicateArray[i+1]){
                lungimeFaraDuplicate++;
            }
        }

        System.out.println(lungimeFaraDuplicate);*/

    }}

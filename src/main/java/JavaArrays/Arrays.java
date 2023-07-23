package JavaArrays;

public class Arrays {
public static boolean compar2Siruri(int[] sir1, int[] sir2){
    boolean siruriEgale=true;
int l1=sir1.length;
int l2= sir2.length;
    if (l1==l2)
    {
        int i = 0;
        do {
            if (sir1[i] == sir2[i]) {
                i++;
            } else {
                siruriEgale=false;
            }

        } while (siruriEgale == true && i < l1);
    } else{
        System.out.println("Eroare: cele 2 siruri nu au lungimi egale!");
        siruriEgale=false;
    }

        return siruriEgale;
    }}



import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
      /* Scanner input = new Scanner(System.in);
      System.out.println("Introdu numarul: ");
      int numarDeBaza= input.nextInt();
      System.out.println("Introdu puytterea la care vrei sa fie ridicat numarul: ");
      int putere= input.nextInt();
      int rezultat=1;
              if(putere==0) {
                  System.out.println("Numarul" + numarDeBaza + "ridicat la putere" + putere + "este" + rezultat);
              }else {
                  for (int i = 0; i < putere; i++)
                      rezultat *=numarDeBaza;





       }*/
        /*  System.out.println("Numarul"+numarDeBaza+ "ridicat la puterea"+putere +"este"+rezultat);*/

          /*  int numar=10;
    while (numar>=1){
        System.out.println("afiseaza ceva");
        numar= numar - 1;
        }


           */
        Scanner input = new Scanner(System.in);
        System.out.println("introdu numarul binar");
        long numarBinar = input.nextLong();
        long j = 1;
        long numarZecimal = 0;
        long reminder;
        while (numarBinar != 0) {
            reminder = numarBinar % 10;
            numarZecimal = numarZecimal + reminder * j;
            j = j * 2;
            numarBinar = numarBinar / 10;


        }
        System.out.println("numarul in zecimal este:" + numarZecimal);


    /*for(int i=10;1>0;i--){
System.out.println(i);
    }
    int i=11;
    do{
        System.out.println("instructiunea din conditie se executa chiar daca conditia e falsa");

    }while(i<10);
}*/
}}






import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Modul2 {
    public static void main(String[] args) {
        ;

   /* //Concatenarea a 2 stringuri;
    String text1="Cel mai bun jucator de fotbal este: ";
    String text2="Leo Messi";
    String text3=text1+text2;
    //  System.out.println(text3);*/

        //Determinarea lungimii unui String;

        //   Scanner sc= new Scanner(System.in);
        //  System.out.println("Introduceti textul: ");
        //   String text4=sc.nextLine();
        //  System.out.println("Lungimea textului introdus este: "+ text4.length());
        // System.out.println(text4.contains("B"));

        //replace
    /*String text5="Primul text a fost scris";
    String text6 =text5.replace("t","r");
    System.out.println(text6);

    String sir = "Java exercises!";
    int i1 = 0;
    int i2 = 10;*/

        /* System.out.println("Pe pozitia: " + i1 + " se afla caracterul: " + sir.charAt(i1));*/
        //  System.out.println("Pe pozitia: " + i2 + " se afla caracterul: " + sir.charAt(i2));

       /* Scanner sc=new Scanner(System.in);
        System.out.println("Introdu testul: ");
        String text= sc.nextLine();
        System.out.println("Introdu pozitia: ");
        int pozitie= sc.nextInt();
        System.out.println("Codul pentru caracterul "+ text.charAt(pozitie)+"este" + text.codePointAt(pozitie));*/

       /* Scanner sc= new Scanner(System.in);
        System.out.println("Introduceti un text: ");
        String text = sc.nextLine();
        System.out.println("Numarul de coduri Unicode diferite este: "+ text.codePointCount(0, text.length()) + " si lungimea este: "+ text.length());*/

      /*  String text1 = "This is exercice 3";
                String text2 = "This is exercice 4";
                        int result = text1.compareTo(text2);
                        if(result < 0){
                            System.out.println("Textul 1 e mai mic lexicografic ca textul 2");
                        } else if (result ==0) {
                            System.out.println("Textul 1 este egal cu textul 2");
                        } else if (result > 0){
                            System.out.println("Textul 1 este mai mare lexicografic ca textul 2");
                        }*/

        /*String text1 = "This is a boy";
        String text2 = "This is a boy";
        int result = text1.compareToIgnoreCase(text2);

        if (result == 0){
            System.out.println("Cele 2 texte sunt egale lexicografic, ignorand scrierea cu majuscule");

        }else if (result < 0) {
            System.out.println("Primul text este mai mic lexicografic decat cel de-al 2-lea, ignorand scrierea cu majuscule");
        } else {
            System.out.println("Primul text este mai mare lexicografic decat cel de-al 2-lea, ignorand scrierea cu majuscule");
        }*/
/*
 Calendar c = Calendar.getInstance();
System.out.format("%tB %te,%tY%n", c ,c ,c );
System.out.format("%tl:%tM %tp%n" , c ,c ,c);
*/
/*String regexString="bogdan@gmail.com";
String regex= "[A-Za-z0-9+_.-]+@(.=)$";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(regexString);

        if (matcher.matches()){
            System.out.println(regexString + " este un email valid");

        } else {
            System.out.println(regexString+ "nu este un email; valid");*/

}}
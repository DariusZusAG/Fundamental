package Dreptunghi;

public class DreptunghiMain {
    public static void main(String[] args){

        Dreptunghi dreptunghi=new Dreptunghi(10,5);
        double perimetru= dreptunghi.calculeazaPerimetrul();
        double arie= dreptunghi.calculeazaAria();
        System.out.println("Perimetrul dreptunghiului este: " +perimetru);
        System.out.println("Aria dreptunghiului este: " +arie);
        System.out.println("Este dreptunghi patrat?"+ dreptunghi.verificaPatrat());
    }
}

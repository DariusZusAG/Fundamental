package Filme;

import static Filme.Film.*;

public class MainFilm {
    public static void main(String[] args){
        Film titanic=new Film("Titanic", 1997,"Drama","DiCaprio",120);
        Film piratiiDinCaraibe=new Film("PiratiiDinCaraibe",2000,"Aventura","Johny Deep", 110);
        Film revenant=new Film("Revenant",2017,"Aventura","DiCaprio",150);
        Film[] filme=new Film[]{titanic,piratiiDinCaraibe,revenant};
        //afiseazaDupaGen(filme,"Aventura");
        //afiseazaDupaActor(filme,"DiCaprio");
afiseazaDupaAni(filme, 2000,2018);
        //afiseazaDupaAni(filme,int anInceput,int anFinal)
        //calculam profitul unei sali de cinema la rularea filmului
        //calculeazaProfitSaptamana(Film film,int nrLocuri,int nrRulariPeZi)
        int[] nrLocuri=new int[]{70,80,90};
        int[] nrRulariZi=new int[]{3,5,2};
  System.out.println(calculeazaCelMaiProfitabilFilm(filme,nrLocuri,nrRulariZi));
  System.out.println("Profit obtinut: " + calculeazaProfitSaptamana(piratiiDinCaraibe, 70,4));
    }
}

package Filme;

import java.util.Arrays;

public class Film {
    private String titlu;
    private int anLansare;
    private String gen;
    private String actorPrincipal;

    private int pret;

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }



    public Film(String titlu, int anLansare, String gen, String actorPrincipal,int pret) {
        this.titlu = titlu;
        this.anLansare = anLansare;
        this.gen = gen;
        this.actorPrincipal = actorPrincipal;
        this.pret=pret;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getAnLansare() {
        return anLansare;
    }

    public void setAnLansare(int anLansare) {
        this.anLansare = anLansare;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }


    public static void afiseazaDupaGen(Film[] filme, String gen) {
        for (int i = 0; i < filme.length; i++) {
            if (filme[i].getGen().equals(gen)) {
                System.out.println(filme[i].getTitlu() + "cu anul de lansare" + filme[i].getAnLansare());
            }
        }


    }

    public static void afiseazaDupaActor(Film[] filme, String actorPrincipal) {

        for (int i = 0; i < filme.length; i++) {

            if (filme[i].getActorPrincipal().equals(actorPrincipal)) {

                System.out.println(filme[i].getTitlu() + " cu actorul Principal " + filme[i].getActorPrincipal());
            }

        }
    }

    public static void afiseazaDupaAni(Film[] filme, int anInceput, int anFinal) {

        for (int i = 0; i < filme.length; i++)
        {

            if (filme[i].getAnLansare() > anInceput && filme[i].getAnLansare() < anFinal) {

                System.out.println(filme[i].getTitlu() + " cu anul de lansare" + filme[i].getAnLansare());
            }
        }
    }

    public static int calculeazaProfitSaptamana(Film film,int nrLocuri, int nrRulariPeZi){

        return film.getPret() * nrLocuri * nrRulariPeZi * 7;
    }

public static String calculeazaCelMaiProfitabilFilm(Film[] filme, int[] nrLocuri,int[] nrRulariPeZi){
        int[] profitabilitatea=new int[filme.length];


        for(int i=0;i<filme.length;i++){
            profitabilitatea[i]=calculeazaProfitSaptamana(filme[i],nrLocuri[i],nrRulariPeZi[i]);

        }
        int max=0;
    for (int i=0;i<profitabilitatea.length;i++){

        if (profitabilitatea[i]>max){
            max=profitabilitatea[i];

        }
    }
    int indexFilm=0;
    for (int i=0;i<profitabilitatea.length;i++){

        if (profitabilitatea[i]==max){
            indexFilm=i;
        }
    }
    return filme[indexFilm].getTitlu();
}

}

package MagazinOnline;

import java.util.Arrays;

public class Stoc {

    protected Ceas[] magazin;

    public Ceas[] getMagazin() {
        return magazin;
    }

    public Stoc(Ceas[] magazin) {
        this.magazin = magazin;
    }

    public void setMagazin(Ceas[] magazin) {
        this.magazin = magazin;
    }
    protected void filtrareMecanism(String mecanism){
        for(int i=0;i<magazin.length; i++){
            if (magazin[i].mecanism.equals(mecanism)){
                System.out.println(magazin[i].brand);
            }
        }
    }

    protected void magazinDurataDeViataMaiMareCa(double durataDeViata){

        int l=this.magazin.length;
        for(int i=0; i<l; i++){

            if (magazin[i].durataDeViata()>durataDeViata){

                System.out.format("Casul cu duarata de vaita mai mare ca %f este%s%n", durataDeViata,magazin[i].getBrand());
            }
    }
}
protected  void ordonareCeasuri(String ordonare){

        int l=this.magazin.length;
        bubleSort();

    if ("crescator".equals(ordonare)) {

        for (int i = 0; i < l; i++) {

            System.out.println(magazin[i].getBrand());
        }} else if ("descrescator".equals(ordonare)) {

            for (int i = l - 1; i >= 0; i--) {

                System.out.println(magazin.length);
            }
        }
    }

        protected Ceas[] bubleSort(){
            int l= magazin.length;

            for(int i=0;i<l;i++){
                for(int j=0;j<l-i-1;j++){
                    if (magazin[j].pret>magazin[j+1].pret){
                        //double temp=magazin[j].pret;
                        Ceas temp=magazin[j];
                        //magazin[j].pret=magazin[j+1].pret;
                        //magazin[j+1].pret=temp
                    magazin[j]=magazin[j+1];
                        magazin[j+1]=temp;
            }

            }

        }
            return magazin;
}

protected void FiltrareDupaStilSiGen(String stil,String gen){
         int l=magazin.length;

        for (int i=0; i< l; i++){

            if (magazin[i].still.equals(stil) && magazin[i].gen.equals(gen)) {

                System.out.format("%n Ceasul care are stilul %s si ggenul%s vaz avea brandul: %s", stil, gen, magazin[i].getBrand());

            }
        }}
        protected void profitabilitateaCeasuri(double[] costuriProductie){

            int l= magazin.length;
            for (int i=0;i< l; i++){
            double x= magazin[i].getPret()-costuriProductie[i];
                double profitabilitate= (x /costuriProductie[i])*100;

                System.out.println("profitabilitatea pentru ceasul :" + magazin[i].brand + " este :"+ profitabilitate +"%");
}}}





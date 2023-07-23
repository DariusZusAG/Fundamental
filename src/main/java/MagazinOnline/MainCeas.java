package MagazinOnline;

public class MainCeas {

    public static void main(String[] args){
        Ceas rolex=new Ceas("Rolex","mecanic","negru", 5000,"bussinbes","barbat");
        Ceas fossil=new Ceas("Fossil","mecanic","maro", 2000,"bussiones", "barbat");
        Ceas huaway=new Ceas("Huawey","smart","gri", 3500,  "casual","femei");
        Ceas Gshock=new Ceas("Gshock","electronic","roz", 1500,  "sport","femei");
        Ceas[]magazin= new Ceas[]{rolex,fossil,huaway,Gshock};

        Stoc ceasuri=new Stoc(magazin);
        //ceasuri.filtrareMecanism("mecanic");
        //ceasuri.magazinDurataDeViataMaiMareCa(0.3);
       // ceasuri.ordonareCeasuri("crescator");
        ceasuri.FiltrareDupaStilSiGen( "sport", "femei");

        double[] costuriProductie= new double[]{2500,230,500,100};
        ceasuri.profitabilitateaCeasuri(costuriProductie);
        }
    }


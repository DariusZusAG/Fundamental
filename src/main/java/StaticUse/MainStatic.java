package StaticUse;

public class MainStatic {

    public static void main(String[] args){

        Pisica.rasa="British";
        Pisica british=new Pisica();
        british.culoare="gri";
        Pisica.Soarece mickey=new Pisica.Soarece();


    }
}

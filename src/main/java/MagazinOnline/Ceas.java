package MagazinOnline;

public class Ceas {

    protected String brand;
    protected String mecanism;
    protected String culoare;
    protected double pret;
    protected String still;
    protected String gen;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMecanism() {
        return mecanism;
    }

    public void setMecanism(String mecanism) {
        this.mecanism = mecanism;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getStill() {
        return still;
    }

    public void setStill(String still) {
        this.still = still;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }


    public Ceas(String brand, String mecanism, String culoare, double pret, String still, String gen) {
        this.brand = brand;
        this.mecanism = mecanism;
        this.culoare = culoare;
        this.pret = pret;
        this.still = still;
        this.gen = gen;
    }

 /*   protected String durataDeViata(String mecanism){

        if ("mecanic".equals(mecanism)){

            return "10 ani";

        }else if ("electronic".equals(mecanism)){
            return "2 ani";

        } else  {//smart
            return"4 zile si 3 ore";*/
    protected int durataDeViata(){

        if ("mecanic".equals(mecanism)){

            return 10;

        }else if ("electronic".equals(mecanism)){
            return 2;

        } else  {//smart
            return 1;
        }
    }
}

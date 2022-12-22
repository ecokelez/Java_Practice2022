package A_QA_Deneme_Pratik;

public class Araclar {

    protected String marka="Marka belirtilmedi";
    protected String model="Model belirtilmedi";
    protected String vites="Vites belirtilmedi";
    protected double gunlukUcret=0;




    public Araclar(String marka, String model, String vites, double gunlukUcret) {
        this.marka = marka;
        this.model = model;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
    }
    Araclar(){

    }

    @Override
    public String toString() {
        return
                "\nmarka=" +
                "\nmodel=" +
                "\nvites=" +
                "\ngunlukUcret=" ;
    }
}

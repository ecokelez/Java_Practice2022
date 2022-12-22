package day13_Okulproje;

public class Ogretmen extends Kisi {

    private String bolum;
    private String sicilNo;

    public Ogretmen(){ // parametreli const. olustuugmuzda
                        // var olan default const. yok ettigi ıcın ileride olası hataları onlemek ıcın

    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return
                "bolum=" +
                "sicilNo=" +super.toString();

        /*super.toString(); asagıdaki bilgileri yani Kisi clasındaki (parent)
         to String deki bilgileri getirmek ıcın eklendi
         return "Kisi{" +
                "adSoyad=" +
                "kimlikNo=" +
                "yas=" ;
         */
    }
}

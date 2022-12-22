package day13_Okulproje;

public class Ogrenci extends Kisi{     // const. kontrol edilecek

    private String ogrenciNo;
    private String sınıf;


    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sınıf) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sınıf = sınıf;
    }

    public Ogrenci(){

    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    @Override
    public String toString() {
        return
                "ogrenciNo=" +
                "sınıf="+
                super.toString();  // Kisi clasındaki (parent) to String parametrelerini
                                    // bilgileri getirmek ıcın eklendi
    }
}

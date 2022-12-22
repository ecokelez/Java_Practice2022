package AA_QA_Practice;

public class Ogrenci {

    private String adSoyad;
    private String tcKimlik;
    private int yas;
    private String ogrenciNo;
    private String sınıf;

    public Ogrenci(String adSoyad, String tcKimlik, int yas, String ogrenciNo, String sınıf) {
        this.adSoyad = adSoyad;
        this.tcKimlik = tcKimlik;
        this.yas = yas;
        this.ogrenciNo = ogrenciNo;
        this.sınıf = sınıf;
    }

    @Override
    public String toString() {
        return
                "\nadSoyad: " +
                "\ntcKimlik: " +
                "\nyas: "+
                "\nogrenciNo: " +
                "\nsınıf: " ;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }
}

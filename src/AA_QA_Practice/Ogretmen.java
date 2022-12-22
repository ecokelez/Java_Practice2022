package AA_QA_Practice;

public class Ogretmen {
    private String adSoyad;
    private String tcKimlik;
    private int yas;
    private String brans;
    private String sicilNo;

    public Ogretmen(String adSoyad, String tcKimlik, int yas, String brans, String sicilNo) {
        this.adSoyad = adSoyad;
        this.tcKimlik = tcKimlik;
        this.yas = yas;
        this.brans = brans;
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return
                "adSoyad: " +
                "tcKimlik: "+
                ", yas: " +
                ", brans: " +
                " sicilNo: ";

    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }
}

package Okul_Proje01;

public class OgretmenBilgileri01 {
    String isim;
    String soyisim;
    int yas;
    String brans;
    String telNo;

    public OgretmenBilgileri01() {
    }

    public OgretmenBilgileri01(String isim, String soyisim, int yas, String brans, String telNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri01 :" +" "+
                "\nisim: " + isim +", "+
                "\nsoyisim: " +soyisim +" ,"+
                "\nyas: " + yas +", "+
                "\nbrans: " + brans +", "+
                "\ntelNo: " + telNo ;
    }
}




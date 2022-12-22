package Okul_proje;

public class OgretmenBilgileri {

    /*
isim,soyısim,yss,brans ve gsm instance variable' ları olusturalım...

 */

    String ısım;
    String soyIsım;
    int yas;
    String brans;
    String telNo;


    public OgretmenBilgileri() {

    }

    // Generate - Constructor --> 5 parametreli Const. olusturudk
    public OgretmenBilgileri(String ısım, String soyIsım, int yas, String brans, String telNo) {
        this.ısım = ısım;
        this.soyIsım = soyIsım;
        this.yas = yas;
        this.brans = brans;
        this.telNo = telNo;


    }

    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "ısım='" + ısım + '\'' +
                ", soyIsım='" + soyIsım + '\'' +
                ", yas=" + yas +
                ", brans='" + brans + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }
}
// to String--kolayca konsolda  yazdırmak ıcın





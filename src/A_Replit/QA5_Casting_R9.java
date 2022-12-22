package A_Replit;

import java.util.Scanner;

public class QA5_Casting_R9 {
    public static void main(String[] args) {

        //Girilen zamanı saniyeye çeviren bir program yazınız
        //Örnek Çıktı:
        //1 saat 10 dakika 50 saniye ==4250 saniye

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen saati gırınız");
        int saat= scan.nextInt();
        System.out.println("Lutfen dakikayı gırınız");
        int dakika= scan.nextInt();
        System.out.println("Lutfen saniyeyi gırınız");
        int saniye=scan.nextInt();


        saat=3600*saniye;
        saat=dakika*60;
        dakika=saniye*60;
        saniye+=saniye;


         int toplamSaniye=saat+dakika+saniye;

        System.out.println("1 saat 10 dakika 50 saniye==>"+toplamSaniye+ " saniye");

    }
}

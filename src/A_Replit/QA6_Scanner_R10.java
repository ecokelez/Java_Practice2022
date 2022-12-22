package A_Replit;

import java.util.Scanner;

public class QA6_Scanner_R10 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin,
        Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
    INPUT:
    Dakika sayısı: 3456789
    OUTPUT :
    3456789 dakika yaklaşık 6 yıl 210 gündür
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dakikayı gırınız");
        int dakika= scan.nextInt();

        int gun=dakika/60/24;
        System.out.println(dakika+" dakıka yaklasık "+ gun/365+ " yıl "+ gun%365+ " gundur " );



    }
}

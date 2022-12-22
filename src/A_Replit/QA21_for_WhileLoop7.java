package A_Replit;

import java.util.Scanner;

public class QA21_for_WhileLoop7 {
    public static void main(String[] args) {
        /*
            Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        * Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
         herhangi bir sayı Mükemmel Sayı olarak bilinir.
         Input :6
         Output:6 Mukemmel Sayidir
         Input : 7, Output: 7 Mukemmel Sayidir degildir.
        mukemmel sayi kontrolu
        1. kullanicidan sayi alalim
        2. bir toplam degiskeni olusturuyoruz
        3. sayinin bolenleri bul
        4. bolenleri toplamla topla
        5. sayiyla toplamin esitligini kontrol et
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  bir tam sayı giriniz");
        int sayı=scan.nextInt();

        mukemmelSayınınKontrolu(sayı);
        boolean kontrol;
        kontrol=mukemmelSayınınKontrolu(sayı);
        System.out.println(kontrol);
        String sonuc=mukemmelSayınınKontrolu(sayı) ? "Sayı mukemel sayıdır" : "Sayı mukemel sayı degildir";
        System.out.println(sonuc);

String output=mukemmelSayınınKontrolu(sayı)? "Sayı mukemel sayıdır" : "Sayı mukemel sayı degildir";
        System.out.println("output :" +sayı+" "+ output);

    }

    private static boolean  mukemmelSayınınKontrolu(int sayı) {
        int toplam=0;
        boolean kontrol=false;
        for (int i=1 ; i<sayı ; i++){
            if (sayı%i==0){
                toplam+=i;
            }
        } if (toplam==sayı){
            kontrol=true;
        }
        return kontrol;
    }
}

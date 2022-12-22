package A_Replit;

import java.util.Scanner;

public class QA14_If_Switch_StringB_8 {
    /*
    Kullanıcıdan bir isim girmesini isteyin
     ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
        INPUT : Mustafa
        OUTPUT : fafafa
     */
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen en az 2 karakter uuznluugnda bir isim giriniz");
        String str= scan.nextLine();

        String result=(str.substring(str.length()-2)+
                str.substring(str.length()-2)+
                str.substring(str.length()-2));
        System.out.println(result);


    }
}

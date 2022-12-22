package A_Replit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QA12_If_Switch_StringB_6 {
    /*
    Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
    Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        Eger aynı karakterlere sahipse
        "isim ayni karakterlere sahiptir." yazdirin.
            Eger ayni kaakterlere sahip degilse
            "Dizenin benzersiz karakterleri var" yazdirin.
        Ternary kullanin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 karakter uzunlugunda bir isim giriniz");
        String str=scan.next();


    /*
        String result=(str.length()>3)  ?  "3 karakter uzunlugunda bir str gırınız" :
                str.charAt(0)==str.charAt(1) || str.charAt(0)==str.charAt(2)? "isim ayni karakterlere sahiptir." :
                "Dizenin benzersiz karakterleri var" ;

                System.out.println(result);

     */


        String result=str.charAt(0)==str.charAt(1) || str.charAt(0)==str.charAt(2)  ?
                "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var" ;

        System.out.println(result);


    }
}

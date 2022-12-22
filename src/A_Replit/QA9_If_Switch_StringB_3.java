package A_Replit;

import java.util.Scanner;

public class QA9_If_Switch_StringB_3 {
    /*
    Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan
    ve yazdıran bir Java programı yazın.
    Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
Ornek:
INPUT :
25
46
OUTPUT :
Numaralarin Toplami:
71
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("0 dan buyuk ve ya esit bir sayı giriniz");
       int sayı1= scan.nextInt();
        System.out.println("0 dan buyuk ve ya esit ikinci  sayıyı giriniz");
        int sayı2=scan.nextInt();
        int toplam=0;



        if(sayı1>1000000000 || sayı2>1000000000 || toplam>=1000000000){
            System.out.println("OverFlow");
        }else{

            System.out.println("Numaralarin Toplami:" +"\n"+(sayı1+sayı2));
        }

    }
}

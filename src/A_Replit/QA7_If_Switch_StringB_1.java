package A_Replit;

import java.util.Scanner;

public class QA7_If_Switch_StringB_1 {
    /*
    Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
BMI 18,5'in altındaysa zayıfsınız
BMI 18,5 ile 25 arasında ise kilonuz idealdir
BMI 25-30 arasındaysa şişmansınız
BMI 30'dan büyük veya eşitse, obez

Input:

Output:
Agirlik : 71
Boy : 1,72
BMI : 23.99945916711736
Zayifsiniz.
     */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //System.out.println("Lutfen agırlıgınızı kg olarak giriniz");

       int  kilo =71;
        System.out.println("Agirlik :" +kilo);
       double boy=1.72;
        System.out.println("Boy :" +boy);

        //System.out.println("Lutfen boyunuzu m olarak giriniz");
        //double boy= scan.nextDouble();

        double BMI=kilo/(boy*boy);
        System.out.println("BMI :"+BMI);

        if (BMI<18.5){
            System.out.println("Zayifsiniz" );
        } else if (BMI>=18.5 || BMI<=25) {
            System.out.println("Kilonuz idealdir");
        } else if (BMI>25 || BMI<30) {
            System.out.println("Sismansınız");
        }else {
            System.out.println("Obezsiniz");
        }
    }
}


package A_Replit;

import java.util.Scanner;

public class QA10_If_Switch_StringB_4 {
    public static void main(String[] args) {
        /*
            Char değişken yanıtının değerini test eden ve
            aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
        yanıt a ise,
        "Talebiniz işleniyor" mesajı yazdırılır
    yanıt b ise,
        "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır ,
        yanıt c ise,
    "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
        başka herhangi bir yanıt değeri için,
    "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char str=scan.next().toLowerCase().charAt(0);

        if (str=='a'){
            System.out.println("Talebiniz işleniyor");
        } else if (str=='b') {
            System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
        } else if (str=='c') {
            System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
        }else System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
    }
}

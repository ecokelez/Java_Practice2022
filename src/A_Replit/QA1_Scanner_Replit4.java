package A_Replit;

import java.util.Scanner;

public class QA1_Scanner_Replit4 {
    public static void main(String[] args) {

        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        1 şeker = 1.7 gr
        Örnek Çıktı:
        Yılda 12.41 kg şeker kullanıyor.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsunuz");
        double bardakS= scan.nextDouble();
        System.out.println("Bir bardk cayda kac gram seker kullanıyorsunuz");
        double sekerM=scan.nextDouble();

        double toplamSekerM=((bardakS*sekerM)*365)/1000;
        System.out.println("Yılda "+ toplamSekerM+ " kg seker kullanıyor");


   /* double gunlukCay= 20;
    double sekerGram=1.7;

    double toplamSekerKg=(gunlukCay*sekerGram*365)/1000;
        System.out.println("Yılda "+ toplamSekerKg+ " kg seker kullanıyor");


    */




    }
}

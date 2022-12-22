package A_QA_Deneme_Pratik;

import java.util.Scanner;

public class Sifre_Ekranı {
    public  static void sifre(){
        System.out.println("........................");
        System.out.println("******Hosgeldiniz********");
        System.out.println(".........................");
        String kartNo="";

        kartNoKabul(kartNo);

        String sifreNo="";
        sifreGiris(sifreNo);
    }

    private static void sifreGiris(String sifreNo) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz....");
        sifreNo= scan.nextLine();

        if (sifreNo.equals("Sinan"));
        System.out.println("Sifre gecerli...");
    }

    private static void kartNoKabul(String kartNo) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kart no giriniz....");
        kartNo= scan.nextLine();
        kartNo=kartNo.replaceAll("\\D","");

        if (kartNo.length()==16){
            System.out.println("kart no gecerli");
        }else {
            System.out.println("Tekrar deneyin");
            kartNoKabul(kartNo);
        }

    }
}

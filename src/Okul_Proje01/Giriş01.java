package Okul_Proje01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giriş01 {
     /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */

    static Scanner scan=new Scanner(System.in);
   static  List<OgretmenBilgileri01> ogretmenList=new ArrayList<>();
     public static void main(String[] args) {
         System.out.println("*****Okulumuza Hosgeldiniz*****");
         System.out.println();

         System.out.println("İsminizi giriniz");
         String isim=scan.next();

         System.out.println("Soyisminizi giriniz");
         String soyisim=scan.next();
         scan.nextLine();
         System.out.println("Yasınızı giriniz");
         int yas= scan.nextInt();

         System.out.println("Bransınızı giriniz");
         String brans=scan.next();
         scan.nextLine();
         System.out.println("Telefon numaranızı giriniz");
         String tel=scan.nextLine();

         OgretmenBilgileri01 adayOgretmen=new OgretmenBilgileri01(isim,soyisim,yas,brans,tel);

         ogretmenList.add(adayOgretmen);
         System.out.println("ogretmenList :" + ogretmenList);

     }
}

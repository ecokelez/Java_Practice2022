package Okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
    static Scanner scan=new Scanner(System.in); //

    public static void main(String[] args) {
        System.out.println("Hosgeldiniz Okulumuza");

        Scanner scan=new Scanner(System.in);
        System.out.println("Isım giriniz");
        String ısım=scan.nextLine();

        System.out.println("Soyısım giriniz");
        String soyIsım=scan.nextLine();

        System.out.println("Yasınızı giriniz");
        int yas= scan.nextInt();

        System.out.println("Bransınızı giriniz");
        String brans=scan.next();

        System.out.println("Tel no giriniz");
        String telNo=scan.next();


        // adayOgretmen objesı olusutruduk
        // OgretmenBilgikerı Const. parametresini icine parametrelerı koyalım

        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(ısım,soyIsım,yas,brans,telNo);

        // listte toplayalım-ArrayListte de toplayabiliriz
        //data type'ı -Diamond icine OgremenBilgileri Clasının ıcındekıbilgilere
        // gore olusturacagız,oradakı  data tipinin ismi olmalı,
        // olusturulacak objelerın data tipi ile OgretmenBilgilerinin calss tipinin ismi aynı olmalı

        List<OgretmenBilgileri>ogretmenList=new ArrayList<>();

        /* adayOgretmen objesını OgretmenBilgileri Constructor ile aldık ve urettik , sonra
       bos bir list olusturduk  ve adayOgretmen objesını add parantezının icine istte ekledık */

        ogretmenList.add(adayOgretmen);
        System.out.println("ogretmenList = " + ogretmenList);
    }
}

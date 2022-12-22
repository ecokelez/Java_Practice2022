package day13_Okulproje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {


    static List<Kisi> ogretmenList=new ArrayList<>();
    static List<Kisi> ogrenciList=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);                                     //tum methodlara ulasmak
       static String kisiTuru;    // niye ?                                     // gokteki ay gibi heryeden ulaşılabilsin


    public static void gırısPaneli(){
        System.out.println("    **********************     ");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("   *************************   ");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("0- ÇIKIŞ");


        String secim= scan.next().toUpperCase();
        switch (secim){
            case "1":
                kisiTuru="OGRENCİ";  // dinamik yaptık
                islemMenusu();
                break;
            case "2":
                kisiTuru="OGRETMEN";

                islemMenusu();
                break;
            case "Q":

                break;
            default:
                System.out.println("hatalı giris : ");
                gırısPaneli();
                break;

        }

    }

    private static void islemMenusu() {
        System.out.println( "Sectigin kisi turu: "+ kisiTuru+ " lutfen asagıdakı islemleri seciniz");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENU\n" +
                "         0-ÇIKIŞ");

        System.out.println("Islem tercihinizi giriniz: ");
        int secilenIslem=scan.nextInt();

        switch (secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                gırısPaneli();
                break;
            case 0:
                cıkıs();
                break;

            default:
                System.out.println("guzel bir sey gir");
                islemMenusu();
                break;

        }
    }

    private static void cıkıs() {
        System.out.println("Yine bekleriz okulumuza,hosçakalın");
    }

    private static void silme() {
        System.out.println("****  "+kisiTuru+ " silme sayfasına Hosgeldın");
        boolean flag=true;

        if (kisiTuru.equalsIgnoreCase("OGRENCİ")){
            System.out.println("Silmek istedigin kimlik no  gir");

            String silinecekKimlikNo= scan.next().replaceAll(" ","");

            for (Kisi each:ogrenciList) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)){
                    System.out.println("Silinen ogrenci :" + each.getAdSoyad());
                    ogrenciList.remove(each); // o ogrenciyi siler
                    flag=false;
                }
            }if(flag){ // eger girilen TC listte yok  ise bu if bodysi calsır
                System.out.println("Bu  TC ile ogrenci yok");

            }
        }else {
            System.out.println("Silinecek ogretmen TC no gir");
            String silinecekKimlikNo= scan.next().replaceAll(" ","");

            for (Kisi each:ogretmenList) {
                if (each.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)){
                    System.out.println("Silinen ogretmen :" + each.getAdSoyad());
                    ogretmenList.remove(each);
                   flag=false;
                   break;
                }
            }if (flag){
                System.out.println("Bu  TC ile ogretmen bulunamadı ve silinemedi");
            }
        }
    }

    private static void listeleme() {
        System.out.println("****  "+kisiTuru+ " ekleme sayfasına Hosgeldın");
        if (kisiTuru.equalsIgnoreCase("OGRENCİ")){
            System.out.println("ogrenciList :" +ogrenciList);
        }else {
            for (Kisi each:ogretmenList) {
                System.out.println("each toString :" + each.toString());
            }
        }
    }

    private static void arama() {
        System.out.println("****  "+kisiTuru+ " arama sayfasına Hosgeldın");
        boolean flag=true; // bayrak yukarıda -> true olan her sart devam eder

        if (kisiTuru.equalsIgnoreCase("OGRENCİ")){
            System.out.println("kimlik no  gir");
            String arananKimlikNo=scan.next().replaceAll(" ","");

            for (Kisi w:ogrenciList) {
                if (w.getKimlikNo().equals(arananKimlikNo)){ //
                    System.out.println("Aradıgınız ogrenci :"+ w.getAdSoyad());
                    flag=false;
                }
            }if(flag){ // flag true ise hala bu if bodysi calısır,yani aranan tc ile ogrenci yok
                System.out.println("Aranan TC ile ogrenci yok");
            }
        }else {

            System.out.println("kimlik no  gir");
            String arananKimlikNo=scan.next().replaceAll(" ","");

            for (Kisi w:ogretmenList) {
                if (w.getKimlikNo().equals(arananKimlikNo)){
                    System.out.println("Aradıgınız ogretmen :"+ w.getAdSoyad());
                    flag=false;
                }
            }if (flag){
                System.out.println("Aranann TC ile ogretmen yok");
            }
        }

    }

    private static void ekle() {// bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi
        System.out.println("***  " + kisiTuru+" ekleme sayfasına hosgeldin");
        System.out.println("isim soyisim gir");
        String adSoyad=scan.nextLine();

        scan.nextLine();//dummy atalım ? iki nextLine arasına hata vermemmesi iicn?

        System.out.println("kimlik gir");
        String kimlikNo= scan.nextLine();

        System.out.println("yas gir");
         int yas= scan.nextInt();

        if (kisiTuru.equals("OGRENCİ")){  // sonra doldur
            System.out.println("ogrenci numarası gir");
            String ogrenciNo= scan.next().replaceAll(" ","");

            scan.nextLine();

            System.out.println("sınıfını gir");
            String sınıfNo= scan.next().replaceAll(" ","");

            Ogrenci ogr=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sınıfNo);
            ogrenciList.add(ogr);
            System.out.println(ogrenciList);

        }else {
            scan.nextLine(); // dummy hata almamak ıcın
            System.out.println("bolum gir");
            String bolum=scan.nextLine();
            scan.nextLine();
            System.out.println("sicil no gir");
            String sicilNo= scan.nextLine();

            Ogretmen ortmen=new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ortmen);
            System.out.println(ogretmenList);
        }
    }

}

package AA_QA_Practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
    static List<Ogretmen> ogretmenList = new ArrayList<Ogretmen>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void anaMenu() { // ANA MENÜ


        System.out.println("###################################");
        System.out.println("## OKUL YÖNETİM PANELİ  ANA MENÜ ##");
        System.out.println("###################################");
        System.out.println("###### 1- ÖĞRENCİ İŞLEMLERİ  ######");
        System.out.println("###### 2- ÖĞRETMEN İŞLEMLERİ  #####");
        System.out.println("###########    Q- ÇIKIŞ  ##########");
        System.out.println("###################################");
        System.out.print("Seçiminiz :  ");
        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":

                kisiTuru = "OGRENCİ";
                islemlerMenusu();
                break;

            case "2":
                kisiTuru = "OGRETMEN";
                islemlerMenusu();
                break;

            case "Q":
                break;

            default:
                System.out.println("HATALI GİRİŞ YAPTIN");
                break;

        } // SWITCH CASE SONU

    } // ANA MENÜ SONU

    public static void islemlerMenusu() {  // Islemler Menusu
        System.out.println("#####################################");
        System.out.println("##### " + kisiTuru + "  İŞLEMLERİ MENÜSÜ #####");
        System.out.println("#####################################");
        System.out.println("#########  1-KAYIT EKLEME  ##########");
        System.out.println("#########  2-KAYIT ARAMA  ###########");
        System.out.println("#########  3-KAYIT LİSTELEME  #######");
        System.out.println("#########  4-KAYIT SİLME  ###########");
        System.out.println("#########  5-ANA MENÜ  ##############");
        System.out.println("#########  0-ÇIKIŞ  #################");

        System.out.print("Bir Seçim Yapınız :");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {

            case 1: // KAYIT EKLEME
                kayıtEkle();
                islemlerMenusu();
                break;

            case 2: //KAYIT ARAMA
                kayıtArama();
                islemlerMenusu();
                break;
            case 3: // KAYIT LİSTELEME
                kayıtListeleme();
                islemlerMenusu();
                break;
            case 4: //KAYIT SİLME
                kayıtSilme();
                islemlerMenusu();
                break;
            case 5: //ANA MENÜ
                break;
            case 0: //ÇIKIŞ
                break;

            default:
                break;

        }
    }   // islemelr Menu sonu

    private static void kayıtSilme() {  // kayıt silme
        System.out.println(" ##### " + kisiTuru + " SİLME SAYFASI ##### ");
        scan.nextLine();
        System.out.println("Silmek istediginiz kişinin TC Kimlik Numarasını girin:");
        String arananKimlik= scan.next();
        boolean varMı=false;

        if (kisiTuru.equals("OGRENCİ")){
            for (int i = 0; i <ogrenciList.size() ; i++) {
               if (arananKimlik.equals(ogrenciList.get(i).getTcKimlik())){
                   System.out.println(ogrenciList.get(i).getAdSoyad()  + " kisini sildiniz");
                   ogrenciList.remove(i);

                   varMı=true;
               }

            }
            if (varMı==false) System.out.println("Ogrenci kayıtlarda yok");
        }else {
            for (int i = 0; i <ogretmenList.size() ; i++) {
                if (arananKimlik.equals(ogretmenList.get(i).getTcKimlik())){
                    System.out.println(ogretmenList.get(i).getAdSoyad() + " kisini sildiniz");
                    ogretmenList.remove(i);
                    varMı=true;
                }
            }
            if (varMı==false) System.out.println("Ogretmen kayıtlarda yok");

        }

    } // kayıt silme sonu

    private static void kayıtArama() {
        System.out.println(" ##### " + kisiTuru + " ARAMA SAYFASI ##### ");
        scan.nextLine();
        System.out.println("Aramak istediginiz kisinin  TC Kimlik Numarasını girin :");
        String arananKimlik=scan.next();
        boolean varMı=false;

        if (kisiTuru.equals("OGRENCİ")){

            for (int i = 0; i <ogrenciList.size() ; i++) {
                if (arananKimlik.equals(ogrenciList.get(i).getTcKimlik())){
                    System.out.println(ogrenciList.get(i));
                    varMı=true;
                }
            }
            if (varMı==false) System.out.println("Ogrenci kayıtlarda yok");
        }else {
            for (int i = 0; i <ogretmenList.size() ; i++) {
                if (arananKimlik.equals(ogretmenList.get(i).getTcKimlik())){
                    System.out.println(ogretmenList.get(i));
                    varMı=true;
                }
            }
            if (varMı==false) System.out.println("Ogretmen kayıtlarda yok");
        }

    }  // kayıt arama sonu

    private static void kayıtEkle() {
        System.out.println("##########################");
        System.out.println("###### KAYIT EKLEME ######");
        System.out.println("##########################");

        if (kisiTuru.equals("OGRENCİ")) {
            scan.nextLine();
            System.out.print("Öğrencinin Adı- Soyadı : ");
            String ogrenciAdi = scan.nextLine();
            System.out.print("Öğrencinin Tc No : ");
            String ogrenciTcNo = scan.nextLine();
            System.out.print("Öğrencinin Yaşı : ");
            int ogrenciYasi = scan.nextInt();
            scan.nextLine(); // dumy;  sout hatası almamak için
            System.out.print("Öğrencinin Sınıfı : ");
            String ogrenciSinifi = scan.nextLine();
            System.out.print("Öğrencinin Numarası : ");
            String ogrenciNo = scan.nextLine();

            Ogrenci ogrenci = new Ogrenci(ogrenciAdi, ogrenciTcNo, ogrenciYasi, ogrenciNo, ogrenciSinifi);
            ogrenciList.add(ogrenci);

        } else {// ogretmen ekleme
            scan.nextLine();
            System.out.print("Öğretmenin Adı- Soyadı : ");
            String ogretmenAdi = scan.nextLine();
            System.out.print("Öğretmenin Tc No : ");
            String ogretmenTcNo = scan.nextLine();
            System.out.print("Öğretmenin  Yaşı : ");
            int ogretmenYasi = scan.nextInt();
            System.out.print("Öğretmenin  Branşı : ");
            String ogretmenBrans = scan.nextLine();
            scan.nextLine();
            System.out.print("Öğretmenin  Sicil No : ");
            String ogretmenSicil = scan.nextLine();

            Ogretmen ogretmen = new Ogretmen(ogretmenAdi, ogretmenTcNo, ogretmenYasi, ogretmenBrans, ogretmenSicil);
            ogretmenList.add(ogretmen);

        }
    }


    private static void kayıtListeleme() { // kayıt listeleme
        if (kisiTuru.equals("OGRENCİ")) {
            System.out.println("############################");
            System.out.println("## KAYITLI TÜM ÖĞRENCİLER ##");
            System.out.println("#############################");

            for (int i = 0; i < ogrenciList.size(); i++) {
                System.out.println(ogrenciList.get(i));
                System.out.println("---------------");
            }
        } else {


            System.out.println("############################");
            System.out.println("## KAYITLI TÜM ÖĞRETMENLER ##");
            System.out.println("#############################");
            for (int i = 0; i < ogretmenList.size(); i++) {
                System.out.println(ogretmenList.get(i));
                System.out.println("---------------");

            }

        }// kayıt listeleme sonu

    }
}

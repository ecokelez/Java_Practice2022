package AA_QA_Practice;

import static AA_QA_Practice.Islemler.ogrenciList;
import static AA_QA_Practice.Islemler.ogretmenList;

public class Input {
    static void hazırInputlar(){
    Ogrenci ogr1=new Ogrenci("Ersoy ÇÖKELEZ","731920",32,"347","JAVA");
    ogrenciList.add(ogr1);

    Ogrenci ogr2=new Ogrenci("Rafet ÇÖKELEZ","732",58,"347","JAVA");
    ogrenciList.add(ogr2);

    Ogretmen ogrt1=new Ogretmen("Mehmet BULUTLUOZ","99",50,"JAVA","2022");
    ogretmenList.add(ogrt1);

    }
}

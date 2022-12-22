package A_Replit.Array_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QA01_Array_Sıralama {
    public static void main(String[] args) {
       /*
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
        not: Test datadaki değerleri kullanınız.
        Test Data:
        [1232, 1134,2345,1022]
        [Java, Python, PHP, C#, C Programming, C++]
        Beklenen Çıktı:
        [1022,1134,1232,2345]
        [C Programming, C#, C++, Java, PHP, Python]
        */

        List<Integer> sayılar1 = new ArrayList<>();
        sayılar1.add(1232);
        sayılar1.add(1134);
        sayılar1.add(2345);
        sayılar1.add(1022);

        Collections.sort(sayılar1);
        System.out.println(sayılar1);


        List<String>programlar=new ArrayList<>();
        programlar.add("C Programming");
        programlar.add("C#");
        programlar.add("C++");
        programlar.add("Python");
        programlar.add("PHP");
        programlar.add("Java");

        Collections.sort(programlar);
        System.out.println(programlar);

    }
}

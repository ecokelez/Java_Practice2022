package QA_Pratik_Constructor_Odev;

public class BookClass {

   /* String adi, yazari;
    int yayinYili;

    */

    // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodlar olusturdugunuz obj leri yazdirin



    String kıtapAdı="Hayvan Ciftligi";
    String yazar="George Orwell";
    int yayınYıl=1984;

    public BookClass() {

    }

    public BookClass(String kıtapAdı, String yazar, int yayınYıl) {
        this.kıtapAdı = kıtapAdı;
        this.yazar = yazar;
        this.yayınYıl = yayınYıl;
    }

    public BookClass(String kıtapAdı, String yazar) {
        this.kıtapAdı = kıtapAdı;
        this.yazar = yazar;
    }


    @Override
    public String toString() {
        return
                "\nkıtapAdı="+
                "\nyazar="+
                "\nyayınYıl=";
    }

    public static void main(String[] args) {
        BookClass book1=new BookClass("Hayvan Ciftligi","George Orwell",1984);
        System.out.println(book1);

        BookClass book2=new BookClass("Dervis'in Teselli Koleksiyonu","H.Macit Ozturk");
        System.out.println(book2);

        yazdır(book1,book2);
    }

    public static void yazdır(BookClass book1, BookClass book2) {

        System.out.println("book1 :" + book1);
        System.out.println("book2 : " + book2);
    }

}
package A_Replit;

public class QA11_If_Switch_StringB_5 {
    public static void main(String[] args) {
       /* Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
                INPUT:
        Ay Numarasi:
        2
        Yil :
        2016
        OUTPUT :
        Subat 2016 29 Gundur.
        */

        int gunSayısı=0;
        int ayNo=2;
        int yıl=2016;

        if (ayNo==1){
            System.out.println("2016 yılında bazı aylar 30 gundur");
        } else if (ayNo==2) {
            System.out.println("Subat 2016 29 Gundur.");
        } else if (ayNo==3) {
            System.out.println("2016 yılında bazı aylar 31 gundur");
        }else System.out.println("Gecerli bir no giriniz");

    }
}

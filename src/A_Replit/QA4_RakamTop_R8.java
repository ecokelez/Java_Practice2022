package A_Replit;

public class QA4_RakamTop_R8 {
    public static void main(String[] args) {


       /*
        Kullanıcıdan üç basamaklı bir sayı girmesini
        ve bu sayının basamaklarının toplamını bulmasını isteyin.

            Örnek Çıktı:
        Verilen tamsayının rakamları toplamı 10'dur.

        */
        int sayı=145;
        int birlerBasamagı=0;
        int rakamlarTop=0;

        birlerBasamagı=sayı%10;
        rakamlarTop+=birlerBasamagı;
        sayı/=10;

        birlerBasamagı=sayı%10;
        rakamlarTop+=birlerBasamagı;
        sayı/=10;

        birlerBasamagı=sayı%10;
        rakamlarTop+=birlerBasamagı;
        sayı/=10;


        System.out.println("Sayının rakamlar toplamı :"+rakamlarTop);




    }
}

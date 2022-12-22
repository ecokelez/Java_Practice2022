package A_Replit;

public class QA18_for_While4 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        Input : 6
        Output: 6!=6*5*4*3*2*1=720
         */

        int input=6;
        faktoriyelHesapla(input);

    }

    private static void faktoriyelHesapla(int input) {
        int faktoriyel=1;


        if (input==0){
            System.out.println("0! = 1");
        }else {
            for (int i = 1; i <=input ; i++) {
                faktoriyel*=i;
            }

            System.out.println("6!="+ faktoriyel);

        }




    }
}

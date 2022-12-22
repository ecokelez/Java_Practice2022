package A_Replit;

public class QA20_for_While6 {
    public static void main(String[] args) {
        /*
        Konsolda Alfabeyi Yazdıran programi yaziniz.
        OUTPUT  :
        a b c .. .. .. .. y z
        a=97     A=65   Z=90;
        z=122

         */

        System.out.println("while loop ile yapalım :");
        int bas=97;
        int bitis=122;

        while (bas<=bitis){
            char sembol=(char) bas;
            System.out.print( sembol+" ");
            bas++;
        }

        System.out.println(" ");
        System.out.println("for loop ile yapalım :");

          bas=97;
         bitis=122;
        for (int j = bas; j <=bitis ; j++) {
            char c=(char) j;
            System.out.print(c+" ");

        }

        System.out.println(" ");
        System.out.println("do while loop ile yapalım :");

        int i=97;
        bitis=122;
        do {
            char s=(char)i;
            System.out.print(s+ " ");
            i++;

        }while(i<=bitis);





    }
}

package A_Replit;

public class QA19_for_While5 {
    public static void main(String[] args) {
        /*
            100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
             OUTPUT  :
            100 98 96 94 92 … … … … 2 0
         */

        int bas=100;
        int bitis=0;

        int temp=bas;

        while (temp>=bitis){
            if (temp%2==0){
                System.out.print(temp+" ");
            }
            temp--;
        }


    }
}

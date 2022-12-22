package A_Replit;

public class QA22_for_WhileLoop8_AsciiDegerSıralama {
    public static void main(String[] args) {
       System.out.println("forLoop ile : ");
        for (int i = 97; i <=122 ; i++) {
            char c=(char) i;
            System.out.println(i+ " ->" + c);

        }

        System.out.println("While Loop ile :");
        int i=97;
        while (i<=122){
            char sembol=(char)i;
            System.out.print(i+"=>"+ sembol+" ");
            i++;
        }



        System.out.println("Do WhileLoop ile:");
        int x=97;
        do{
            char ch=(char) x;
            System.out.println(x+"->"+ ch);
            x++;

        }while (x<=122);
    }
}

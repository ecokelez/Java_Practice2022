package A_Replit;

public class QA23_forWhileLoop9_Reverse {
    public static void main(String[] args) {
       /*
        input=1238;
        output=8321
        */

            String input="1238";
            tersdenYazdır(input);


    }

    private static void tersdenYazdır(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println("Girilen numaranın tersi: " +tersInput);
    }
}

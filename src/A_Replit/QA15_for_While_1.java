package A_Replit;

public class QA15_for_While_1 {
    /*
    Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
    ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        char ch1= 'a' ;
	String name =“John came late"
	Expected Output:
        Number of a = 2
     */

    public static void main(String[] args) {
        String name ="John came late" ;
        char ch1= 'a' ;

        int count=0;

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i)==ch1){
                count++;
            }
        }

        System.out.println(" Number of a :" + count);

    }
}

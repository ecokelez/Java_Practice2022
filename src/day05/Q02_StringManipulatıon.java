package day05;

import java.util.Scanner;

public class Q02_StringManipulatıon {
    public static void main(String[] args) {

        /*
        Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("string1 :");
        String str1=scan.nextLine();

        System.out.println("string2 :");
        String str2=scan.nextLine();

        System.out.println("1. yontem :" + str1+ " "+ str2);
        System.out.println("2. yöntem : "+ str1.concat(" " +str2));

        String str1Al=str1.substring(1);
        String str2Al=str2.substring(1);

        System.out.println("manipulation sonrası : "+ str1Al+""+str2Al);






    }
}

package day10;

public class Q05_MDArray {

          /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */

    public static void main(String[] args) {
        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        elemanSayısı(arr);
        System.out.println("elemanSayisi(arr) = " + elemanSayısı(arr));
    }

    private static int elemanSayısı(int[][] arr) {
        int count=0;
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length ; j++) {
                count++;

            }

        }
        return count;
    }
}
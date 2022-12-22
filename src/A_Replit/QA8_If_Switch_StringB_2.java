package A_Replit;

public class QA8_If_Switch_StringB_2 {
   /* Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
            Input :
    John White
1234234534561478
    Output : Name :
    J*** W****
    CCN : **** **** **** 1478
    Ilk Harfler Buyuk harf ile baslamalidir.
    */
   public static void main(String[] args) {
       String str="John White";
       String kartNo="1234234534561478";

       String isimİlkHarf=str.substring(0,1).toUpperCase()+str.substring(1,4).replaceAll("\\w","*")+" "+
                        str.substring(5,6).toUpperCase()+
                        str.substring(6).replaceAll("\\w","*");



        String sonRakam=" "+kartNo.substring(12,16);
        String kalanRakam=kartNo.substring(0,4).replaceAll("\\w","*")+" "+
                            kartNo.substring(4,8).replaceAll("\\w","*")+" "+
                            kartNo.substring(8,12).replaceAll("\\w","*");
       System.out.println("Name :"+isimİlkHarf+ "\nCCN :"+kalanRakam+sonRakam);



   }
}

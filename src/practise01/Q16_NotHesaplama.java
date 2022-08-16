package practise01;

import java.util.Scanner;

public class Q16_NotHesaplama {

    public static void main(String[] args) {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

       Scanner scan=new Scanner(System.in);
        System.out.println("vize1,vize2,final notunuzu giriniz");
        int vize1= scan.nextInt();
        int vize2= scan.nextInt();
        int Final= scan.nextInt();

        int vizeOrt= (vize1+vize2)/2;
        int sonuc= (int) ((vizeOrt*0.3) + (Final*0.7));
        System.out.println("Sonucunuz :" + sonuc);




    }
}

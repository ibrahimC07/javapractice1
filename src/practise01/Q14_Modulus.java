package practise01;

import java.util.Scanner;

public class Q14_Modulus {

    public static void main(String[] args) {

        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Bes basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

       int ilkikibasamak ;
       int sonikibasamak ;
       ilkikibasamak = sayi/1000 ;
       sonikibasamak = sayi % 100 ;

        System.out.println(ilkikibasamak/10+ilkikibasamak%10+sonikibasamak/10+sonikibasamak%10);


        // hocanin cozumu

        System.out.print("lutfen 5 basamakli sayi giriniz :");
        int num=scan.nextInt();
        int ilkIki= num/1000;
        int sonIki= num%100; //100 e bolumunden kalani verir
        int ilkIkiTop = (ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki/10) + (sonIki%10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("sayilarin toplami :" + (ilkIkiTop+ sonIkiTop));




    }
}

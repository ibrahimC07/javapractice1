package practise01;

import java.util.Scanner;

public class Q10_ifStatement01 {

    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

       Scanner scan=new Scanner(System.in);
        System.out.println("Y/N ikilisinden birini giriniz");
        char harf=scan.next().charAt(0);

        if (harf=='Y' || harf=='y'){
            System.out.println("YES");
        }else if (harf=='N' || harf=='n'){
            System.out.println("NO");
        }else {
            System.out.println("Tekrar deneyiniz");
        }
    }
}

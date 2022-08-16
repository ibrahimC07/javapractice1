package practise01;

import java.util.Scanner;

public class Q21_KanBagisiYasAraligi {

    public static void main(String[] args) {

        /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("yasini ve kilonuzu giriniz");
        int yas=scan.nextInt();
        double kilo=scan.nextDouble();
        if (yas<0){
            System.out.println("yasinizi yanlis girdiniz");
        }else if (yas>=0 && yas<18){
            System.out.println("kan bagisi yapamaz");
        }else if (yas>18 && kilo<50){
            System.out.println("kan bagisi yapamaz");
        }else System.out.println("kan bagisi yapabailir");





    }
}

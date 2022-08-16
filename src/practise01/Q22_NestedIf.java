package practise01;

import java.util.Scanner;

public class Q22_NestedIf {

    public static void main(String[] args) {

        /*
        oy kullanma yasi :
        age >= 18  ==> oy kullanmaya uygun
        age >= 70  ==> uc kez oy kullanabilir
        70 > age >=50 ==> iki kez oy kullanabilir
        50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

         */

     Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi girin");
        int yas=scan.nextInt();

        if (yas>=70){
            System.out.println("uc kez oy kullanabilir");
        }else if (yas>=50 && yas<70){
            System.out.println("ikiz kez oy kullanabilir");
        }else if (yas>=18 && yas<50){
            System.out.println("birkez oy kullabilirsiniz");
        }else if (yas>=18 ){
            System.out.println("oy kullanmaya uygun");
        }else System.out.println("oy kullanamazsin");
    }
}

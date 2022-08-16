package practise01;

import java.util.Scanner;

public class Q17_YolHizZaman {

    public static void main(String[] args) {

        /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.
          */

       Scanner scan=new Scanner(System.in);
        System.out.println("mesafe ve hizi giriniz");
        int mesafe=scan.nextInt();
        int hiz=scan.nextInt();

        double hedef= mesafe/hiz ;

        System.out.println(hedef);
        // scan.close(); bu yontemle scani kapatabilirsiniz. bilmis olalim en azindan.

    }
}

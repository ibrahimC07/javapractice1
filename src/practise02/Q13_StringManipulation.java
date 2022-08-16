package practise02;

import java.util.Scanner;

public class Q13_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        String isim= "mehmet";
        String soyisim="celeods";

        if (isim.length()>soyisim.length()){
            System.out.println(isim);
        }else System.out.println(soyisim);
    }
}

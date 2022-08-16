package practise02;

import java.util.Scanner;

public class Q08_StringManipulation {
    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */
    public static void main(String[] args) {

        String input = "alioio" ;

        if (input.length()>=3){
            input=input.substring(input.length()-2);
            input=input+input+input;
            System.out.println(input);
        }else System.out.println(input);
    }
    }


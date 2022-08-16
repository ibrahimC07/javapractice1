package practise02;

import java.util.Scanner;

public class Q12_StringManipulation {
    public static void main(String[] args) {
        /*
         Kullanicidan bir kelime girmesini isteyin.
        * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
         * kelimenin ortasindaki karakteri yazdirin.
         */

        String str = "aynenaa";

        if (str.length()%2==1 && str.length()>=3){
            String str2= str.substring(str.length()/2,(str.length()/2)+1);
            System.out.println(str2);
        }

    }
}

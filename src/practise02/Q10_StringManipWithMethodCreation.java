package practise02;

public class Q10_StringManipWithMethodCreation {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        String str1 = "afdsa" ;

        kontrolEt(str1);
        System.out.println(kontrolEt(str1));


    }

    public static boolean kontrolEt(String str1) {
        if (str1.contains("xyz")){
            return true ;
        }else return false ;
    }
}

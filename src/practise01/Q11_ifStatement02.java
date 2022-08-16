package practise01;

public class Q11_ifStatement02 {

    public static void main(String[] args) {

        /*
not hesaplayici
   A => 90 ~100
   B => 80 ~ 89
   C => 70 ~ 79
   D => 60 ~ 69
   F =>  0 ~ 59
 */


       int not=100;

       if (not>=0 && not<60){
           System.out.println("F");
       }else if (not<70){
           System.out.println("D");
       }else if (not<80){
           System.out.println("C");
       }else if (not<90){
           System.out.println("B");
       }else if (not<=100){
           System.out.println("A");
       }else System.out.println("Tekrar deneyiniz");
    }
}

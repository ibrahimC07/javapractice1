package practise01;

public class Q23_NestedTernary {
    public static void main(String[] args) {

        /*
         Final notu tanimlayin, Nested Ternary ile cozunuz
           'A'  ->  "Gayet Basarili"
           'B'  ->  "Basarili"
          'C'  ->   "Ha gayret"
        bu notlar disindakilere de Digerleri.. yazdiriniz
 */

        char not= 'A';

        if (not=='A'){
            System.out.println("gayet basarali");
        }else if (not=='B'){
            System.out.println("Basarali");
        }else if (not=='C'){
            System.out.println("Ha gayret");
        }else System.out.println("tekrar deneyiniz");

        String sonuc= not=='A' ? "gayet basarili" : not=='B' ? "basarili" : not=='C' ? "ha gayret" : "gecersiz" ;
        System.out.println("sonuc = " + sonuc);

    }
}

package practise01;

public class Q27_NestedTernary {
    public static void main(String[] args) {

        /*
         0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
         kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
         cikis "Gecersiz" olmalidir
         NestedIf ve Ternary kullanarak 2 yolla da cozunuz
        */
        int sayi= 4 ;
        String sonuc= "" ;
        if (sayi>0 && sayi<9){
            switch (sayi){
                case 1 : System.out.println("bir");break;
                case 2 : System.out.println("iki");break;
                case 3 : System.out.println("uc");break;
                case 4 : System.out.println("dort");break;
                case 5 : System.out.println("bes");break;
                case 6 : System.out.println("alti");break;
                case 7 : System.out.println("yedi");break;
                case 8 : System.out.println("sekiz");break;

            }
        }else System.out.println("gecersiz");


        if (sayi>0 && sayi<9){
            if (sayi==1) {sonuc= "bir" ;}
            else if (sayi==2){sonuc= "iki" ;}
            else if (sayi==3){sonuc= "uc" ;}
            else if (sayi==4){sonuc= "dort" ;}
            else if (sayi==5){sonuc= "bes" ;}
            else if (sayi==6){sonuc= "alti" ;}
            else if (sayi==7){sonuc= "yedi" ;}
            else if (sayi==8){sonuc= "sekiz" ;}





            }else System.out.println("geceriz");
        System.out.println(sonuc);

        String result = sayi==1 ? "bir" : sayi==2 ? "iki" : sayi==3 ? "uc" : sayi==4 ? "dort"
                : sayi==5 ? "bes" : sayi==6 ? "alti" : sayi==7 ? "yedi" : sayi==8 ? "sekiz" : "gecersiz" ;
        System.out.println(result);

        }

    }


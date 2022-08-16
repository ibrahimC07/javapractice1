package practise01;

public class Q24_SwitchCase {

    public static void main(String[] args) {
        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
          */


        String gun="persembe" ;

        switch (gun){
            case "pazartesi" :
            case "sali" :
                System.out.println("Java dersleri ginleri");
                break;
            case "persembe" :
            case "cuma" :
                System.out.println("Selenium dersi gunleri");
                break;
            case "carsamba" :
            case "cumartesi" :
                System.out.println("SQL dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");
        }
    }
}

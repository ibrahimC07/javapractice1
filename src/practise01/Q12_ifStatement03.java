package practise01;

import java.util.Scanner;

public class Q12_ifStatement03 {

    public static void main(String[] args) {

        /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("is unvanini giriniz");
        String jobTitle=scan.nextLine();

        if (jobTitle.equals("qa")){
            System.out.println("Quality Analyst");
        }else if (jobTitle.equals("dev")){
            System.out.println("Developer");
        }else if (jobTitle.equals("ba")){
            System.out.println("Business Analyst");
        }else if (jobTitle.equals("pm")){
            System.out.println("Project Manager");
        }else System.out.println("Tekrar deneyiniz");

        switch (jobTitle){
            case "qa" :
                System.out.println("Quality Analyst");
                break;
            case "dev" :
                System.out.println("Developer");
                break;
            case "ba" :
                System.out.println("Business Analyst");
                break;
            case "pm" :
                System.out.println("Project manager");
                break;
            default:
                System.out.println("Tekrar deneyiniz");

        }
    }
}

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        int kilo;
        double  boyKare,boy,vke;

        Scanner inp = new Scanner(System.in);

        System.out.println("Boyunuzu m cinsinden giriniz :");
        boy = inp.nextDouble();
        boyKare = boy*boy;



       System.out.println("Kilonuzu kg cinsinden giriniz :");
        kilo = inp.nextInt();

        vke = kilo/boyKare;

       System.out.println("Vücut kitle endeksiniz : " + vke);



    }


}

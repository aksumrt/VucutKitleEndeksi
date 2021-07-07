import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        int kilo;
        double  boyKare,boy,vke;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu m cinsinden giriniz :");
        boy = inp.nextDouble();
        boyKare = boy*boy;



       System.out.print("Kilonuzu kg cinsinden giriniz :");
        kilo = inp.nextInt();

        vke = kilo/boyKare;

       System.out.println("Vücut kitle endeksiniz : " + vke);



    }


}

import java.util.Scanner;

public class vucudKitleIndeksi {
    public static void main(String[] args) {
        float boy,kilo;
        double sonuc;

        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextFloat();
        System.out.println("Kilonuzu giriniz: ");
        kilo = inp.nextFloat();
        sonuc = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+sonuc);

    }
}

//Bir sayının basamak sayılarının toplamını hesaplayan program
import java.util.Scanner;

public class dongu6 {
    public static void main(String[] args) {
        int sayi, sayac = 0;
        int basamakDeger, sonuc = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        sayi = inp.nextInt();
        int gecici = sayi;

        while (gecici != 0) {
            gecici /= 10;
            sayac++;
        }
        gecici = sayi;
        while (gecici != 0) {
            basamakDeger = gecici % 10;
            sonuc += basamakDeger;
            gecici /= 10;
        }
        System.out.println(sonuc);
    }
}


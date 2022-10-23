//Java ile girilen sayının harmonik serisini bulan program
import java.util.Scanner;
public class dongu7 {
    public static void main(String[] args) {
        double sonuc = 0.0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = inp.nextInt();

        for (int i = 1; i<=sayi; i++){
            sonuc += 1.0/i;
        }
        System.out.println(sonuc);
    }
}

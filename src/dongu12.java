//Mükemmel sayı bulan program
import java.util.Scanner;

public class dongu12 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = inp.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;

            }
        }if(toplam == sayi){
            System.out.println(sayi+" Sayısı mükemmel bir sayıdır.");
        }else {
            System.out.println(sayi+" Sayısı mükemmel bir sayı değildir.");
        }
    }
}

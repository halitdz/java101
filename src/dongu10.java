//While döngüsü ile EBOK ve EKOK değer bulan program
import javax.swing.border.EmptyBorder;
import java.util.Scanner;

public class dongu10 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = inp.nextInt();
        int ebob = 1;
        int ekok = 1;
        int a = sayi1;

        while (true) {
            if (sayi1 % a == 0 && sayi2 % a == 0) {
                ebob = a;
                ekok = (sayi1 * sayi2) / ebob;
                break;

            }
            a--;
        }
        System.out.println(ebob);
        System.out.println(ekok);
    }
}


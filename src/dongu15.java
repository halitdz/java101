//fibonacci serisi bulan program
import java.util.Scanner;

public class dongu15 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = inp.nextInt();
        int a = 0, b = 1, toplam;

        System.out.print(a+" "+b);
        for (int i = 2; i <= n; i++) {

            toplam = a + b;
            a = b;
            b = toplam;

            System.out.print(" "+ toplam);
        }
    }
}

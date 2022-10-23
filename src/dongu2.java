//çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
import java.util.Scanner;

public class dongu2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;
        double toplam = 0;
        System.out.print("Bir sayı giriniz: ");
        sayi = inp.nextByte();

        while (true){
            if (sayi % 2 != 0){
              break;
            }
            else{
                if(sayi % 4 == 0){
                    toplam += sayi;
                }
            }
            System.out.print("Bir sayı giriniz: ");
            sayi = inp.nextByte();
        }
        System.out.println(toplam);
    }
}

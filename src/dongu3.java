//girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
import java.util.Scanner;

public class dongu3 {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        sayi = inp.nextByte();

        for(int i = 1; i<=sayi; i*=4){
            System.out.println(i);
        }
        for (int i = 1; i<=sayi;i*=5){
            System.out.println(i);
        }
    }

}

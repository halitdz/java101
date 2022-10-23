//0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
import java.util.Scanner;

public class dongu1 {
    public static void main(String[] args) {
        int a , b=0 ,toplam=0 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        a = input.nextInt();
        for (int i=1; i<=a; i++ ){
            if(i%3==0 && i%4==0 ){
                b++;
                System.out.println(i);
                toplam+=i;

                System.out.println(b);
            }
        }
        System.out.println("ortalama: "+toplam/b);
    }
}

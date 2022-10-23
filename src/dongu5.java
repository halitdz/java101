//girdiği değerler ile üslü sayı hesaplayan program
import java.util.Scanner;

public class dongu5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int taban,ust,sonuc = 1;

        System.out.print("Taban Sayısını giriniz: ");
        taban = inp.nextInt();
        System.out.print("Ust kısmı giriniz: ");
        ust = inp.nextInt();
       /*
        double sonuc = Math.pow(taban,ust);
        System.out.println(sonuc);
        */
        for(int i = 1; i<=ust; i++){
            sonuc *= taban;
        }
        System.out.println(sonuc);
    }
}

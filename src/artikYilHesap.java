import java.util.Scanner;
public class artikYilHesap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();
        if (yil % 4 == 0) {

            System.out.println(yil+" bir artık yıldır !");
        }
        else {
                System.out.println(yil + " bir artık yıl değildir ! ");
        }
    }
}

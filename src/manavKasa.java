import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        int a,b,c,d,e;
        float armut = 2.14f;
        float elma = 3.67f;
        float domates = 1.11f;
        float muz = 0.95f;
        float patlican = 5;
        double toplam = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        a = inp.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        b = inp.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        c = inp.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        d = inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        e = inp.nextInt();

      toplam = (a*armut)+(b*elma)+(c*domates)+(d*muz)+(e*patlican);
        System.out.println("Toplam tutar : "+toplam+"TL");
    }
}

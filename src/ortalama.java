import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        int mat,fiz,kim,turk,tar,muz;
        double sonuc;
        Scanner inp = new Scanner(System.in);

        System.out.println("Mat notu:");
        mat = inp.nextInt();
        System.out.println("Fizik notu: ");
        fiz = inp.nextInt();
        System.out.println("Kimya notu: ");
        kim = inp.nextInt();
        System.out.println("Türkçe notu: ");
        turk = inp.nextInt();
        System.out.println("Tarih notu: ");
        tar = inp.nextInt();
        System.out.println("Müzik notu: ");
        muz = inp.nextInt();

        sonuc = (mat+fiz+kim+turk+tar+muz)/6;
        boolean a = sonuc > 60;
        System.out.println(sonuc);
         String sonuc2 = (a) ? "Sınıfı geçti" : "Sınfta kaldı";

        System.out.println(sonuc2);
    }
}

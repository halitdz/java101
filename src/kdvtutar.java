import java.util.Scanner;

public class kdvtutar {
    public static void main(String[] args) {
        double tutar;
        Scanner inp = new Scanner(System.in);
        System.out.println("Ana parayı Giriniz: ");
        tutar = inp.nextDouble();

        double sonuc3 = (tutar > 0 && tutar < 1000) ?  tutar + tutar*18/100 : tutar + tutar*8/100;
        System.out.println("KDV'li fiyat=" +sonuc3+"TL;");


    }
}

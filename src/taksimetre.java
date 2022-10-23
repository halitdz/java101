import java.util.Scanner;
public class taksimetre {

    public static void main(String[] args) {

        double km = 2.20,tutanMiktar = 10;
        int mesafe;
        Scanner inp = new Scanner(System.in);
        System.out.println("Gidilecek Mesafeyi giriniz : ");
        mesafe = inp.nextInt();
        tutanMiktar += km*mesafe;
        double odenecekTutar = (tutanMiktar > 20 ) ? tutanMiktar +=  km*mesafe : 20  ;
        System.out.println(odenecekTutar);
    }

}


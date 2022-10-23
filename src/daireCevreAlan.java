import java.util.Scanner;

public class daireCevreAlan {
    public static void main(String[] args) {
        double pi = 3.14;
        double yaricap,alan;
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını ve Merkez açısını giriniz.");

        yaricap = inp.nextDouble();
        a = inp.nextInt();

        alan = (pi*(yaricap*yaricap)*a)/360;
        System.out.println("Alan "+alan);
    }
}

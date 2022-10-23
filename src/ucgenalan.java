import java.util.Scanner;
public class ucgenalan {
    public static void main(String[] args) {
        int a,b,c;
        double alan;
        Scanner inp = new Scanner(System.in);
        System.out.println("Üçgenin kenarlarını girin: ");
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();
        int u = (a+b+c)/2;
        alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println(alan);

    }
}

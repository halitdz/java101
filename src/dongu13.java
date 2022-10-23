//Ters üçgen yapan program
import java.util.Scanner;

public class dongu13 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int a = inp.nextInt();

        for(int i = a; i>0; i--){
            for (int j = a-i; j>0; j--){
                System.out.print(" ");
            }

            for (int k = 2*i-1; k> 0; k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

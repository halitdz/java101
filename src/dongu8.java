//yıldızlar ile elmas yazan program
import java.util.Scanner;

public class dongu8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = inp.nextInt();

        for(int i = 1; i<=n; i++){
            for(int k = 1; k<= (n-i); k++){
                System.out.print(" ");
            }
            for (int j= 1; j<= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
            }
        for(int i = 2; i<=n; i++){
            for(int j = 1; j<= (i-1); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * n - (2 * i - 1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    }


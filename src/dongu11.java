//N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program
import java.util.Scanner;

public class dongu11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = inp.nextInt();
         int max = 0,min = 0;
        for(int i = 1; i<=n; i++){
            System.out.print(i+". Sayıyı giriniz: ");
           int a = inp.nextInt();
            if (i == 1){
                max = a;
                min = a;
            }
           if (a>max){
                  max =a;
              }if (a<min){
                  min = a;
              }
        }
        System.out.println(max);
        System.out.println(min);
    }


    }


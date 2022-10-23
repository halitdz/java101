//kombinasyon hesaplayan program
import java.util.Scanner;

public class dongu4 {
    public static void main(String[] args) {
        int n,r,i,j;
        int top1 = 1,top2 = 1,top3 = 1;
        int comb;
        Scanner inp = new Scanner(System.in);
        System.out.print("n eleman sayısını giriniz: ");
        n = inp.nextInt();
        System.out.print("oluşturalacak farklı gruplar için r değeri: ");
        r = inp.nextInt();

        int sonuc = n-r;

        for (i = 1; i <= n ; i++){
            top1 *= i;
        }
        for(j = 1; j<=r; j++){
            top2 *= j;
        }
        for (int z =1; z<=sonuc; z++){
            top3 *= z;
        }
        comb = top1/(top2*top3);
        System.out.println(comb);
    }
}

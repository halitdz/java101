import java.util.Scanner;
public class sinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fiz,turk,kim,muz;
        double toplam = 0;
        int dersSayac =0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notu: ");
        mat = inp.nextInt();
        System.out.print("Fizik notu: ");
        fiz = inp.nextInt();
        System.out.print("Türkçe notu: ");
        turk = inp.nextInt();
        System.out.print("Kimya notu: ");
        kim = inp.nextInt();
        System.out.print("Müzik notu: ");
        muz = inp.nextInt();

       if (mat > 0 && mat <= 100){
          toplam += mat;
           dersSayac++;
       }else{
           System.out.println("Matematik notu ortalmaya dahil edilmedi.");
       }
       if(fiz > 0 && fiz <= 100 ){
           toplam += fiz;
           dersSayac++;
       }else{
           System.out.println("Fizik notu ortalmaya dahil edilmedi.");
       }
        if (turk > 0 && turk <= 100){
            toplam += turk;
            dersSayac++;
        }else{
            System.out.println("Türkçe notu ortalmaya dahil edilmedi.");
        }
        if (kim > 0 && kim <= 100){
            toplam += kim;
            dersSayac++;
        }else{
            System.out.println("Kimya notu ortalmaya dahil edilmedi.");
        }
        if (muz > 0 && muz <= 100){
            toplam += muz;
            dersSayac++;
        }else{
            System.out.println("Müzik notu ortalmaya dahil edilmedi.");
        }
        double ortalama = toplam/dersSayac;
        if(ortalama>=55){
            System.out.println("Ortalamanız: "+ortalama);
            System.out.println("Geçtiniz.");


        }else {
            System.out.println("Ortalamanız: "+ortalama);
            System.out.println("Kaldınız.");
        }
    }
}

import java.util.Scanner;

public class kucukhespmakninesi {
    public static void main(String[] args) {
        int s1, s2, secim;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        s1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        s2 = inp.nextInt();
        System.out.println("Yapmak istediğiniz işlemi giriniz.");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim = inp.nextInt();

           switch (secim){
                 case 1 :

                     System.out.println(s1+s2);

                     break;
                 case 2 :

                     System.out.println(s1-s2);

                     break;
                 case 3 :
                     System.out.println(s1*s2);

                     break;

                 case 4 :
                     System.out.println(s1/s2);
                     break;
               default:
                   System.out.println("Hatalı seçim!");

           }
        System.out.println("Hesaplama sona erdi.");
    }
}
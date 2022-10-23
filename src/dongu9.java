//switch-case ile basit atm projesi
import java.util.Scanner;

public class dongu9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kalanHak = 3;
        int bakiye = 2000;
        int secim;

        while (kalanHak > 0){
            System.out.print("Kullanıcı adı giriniz:");
            String kullaniciAdi = inp.nextLine();
            System.out.print("Şifre giriniz: ");
            String sifre = inp.nextLine();

            if(kullaniciAdi.equals("hltdz") && sifre.equals("051121")){
                System.out.println("X Bankasına hoşgeldiniz.");
                System.out.println("Yapmak istediğiniz işlemi seçiniz.\n" +
                        "1-Para yatırma\n" +
                        "2-Para çekme\n" +
                        "3-Bakiye sorgula\n" +
                        "4-Çıkış yap");
               secim = inp.nextInt();
                switch (secim) {
                    case 1 -> {
                        System.out.print("Yatıralacak miktarı giriniz: ");
                        int miktar = inp.nextInt();
                        int sonuc = bakiye + miktar;
                        System.out.println("Yeni bakiye: " + sonuc);
                    }
                    case 2 -> {
                        System.out.print("Çekilecek miktarı giriniz: ");
                        int miktar2 = inp.nextInt();
                        if (miktar2 <= bakiye) {
                            int sonuc2 = bakiye - miktar2;
                            System.out.println("Yeni bakiye: " + sonuc2);
                        } else {
                            System.out.println("Bakiyeniz bu işlem için yetersizdir.");
                        }
                    }
                    case 3 -> System.out.println("Bakiyeniz: " + bakiye);
                    case 4 -> System.out.println("Çıkış yapılıyor.İyi günler dileriz.");
                    default -> System.out.println("Hatalı giriş yaptınız.");
                }
                break;
            }else{
                kalanHak--;
                System.out.println("Kullanıcı adı veya şifre hatalı.");

                if (kalanHak==0){
                    System.out.println("Hesabınız bloke olmuştur.Banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız."+kalanHak);
                }
            }
        }

    }
}

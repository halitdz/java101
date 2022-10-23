import java.util.Scanner;

public class kullaniciSifreHatası {
    public static void main(String[] args) {
       String kullaniciAdi,sifre;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullancı adınızı giriniz: ");
        kullaniciAdi = inp.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre = inp.nextLine();

        if (kullaniciAdi.equals("Halit") && sifre.equals("sanane")){
            System.out.println("Girilen bilgiler doğru giriş yapılıyor.");

        }else{
            System.out.println("Kullancı adı veya şifre hatalı.\nŞifrenizi sıfırlamak ister misiniz ?\n'Evet'veya'Hayır'");

            String secim = inp.nextLine();
            switch (secim) {
                case "Evet" : {
                    String yeniSifre;
                    System.out.println("Yeni şifreyi giriniz.");
                    yeniSifre = inp.nextLine();
                    if (yeniSifre.equals("sanane")) {
                        System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");

                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                }
                case "Hayır" :
                    System.out.println("Şifre değiştirilmeyecek.");
            }
        }



    }
}

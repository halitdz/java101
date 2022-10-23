import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km,yas,ytipi,toplamFiyat = 0,indirimliFiyat = 0,ikinciIndirim = 0;

        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();
        System.out.print("Mesafeyi km türünden giriniz ");
        km = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş:");
        ytipi = inp.nextInt();
        toplamFiyat += km*0.10;

        if(yas > 0 && (ytipi == 1 || ytipi ==2)){
            if (yas<12 && ytipi ==1) {
                indirimliFiyat = (int) (toplamFiyat-toplamFiyat*0.5);
                System.out.println(indirimliFiyat+"TL");
            }else if (yas<12){
                indirimliFiyat = (int) (toplamFiyat - toplamFiyat*0.5);
                ikinciIndirim = (int) ((indirimliFiyat-indirimliFiyat*0.2)*2);
                System.out.println(ikinciIndirim+"TL");
            }
            else if((yas>12 && yas<24) && ytipi == 1) {
                indirimliFiyat = (int) (toplamFiyat - toplamFiyat * 0.1);
                System.out.println(indirimliFiyat+"TL");
            }else if(yas > 12 && yas<24){
                indirimliFiyat = (int) (toplamFiyat - toplamFiyat * 0.1);
                ikinciIndirim = (int) ((indirimliFiyat-indirimliFiyat*0.2)*2);
                System.out.println(ikinciIndirim+"TL");
            }else if (yas>65 && ytipi == 1){
                indirimliFiyat =(int) (toplamFiyat - toplamFiyat*0.3);
                System.out.println(indirimliFiyat+"TL");
            }else if(yas>65){
                indirimliFiyat =(int) (toplamFiyat - toplamFiyat*0.3);
                ikinciIndirim = (int) ((indirimliFiyat - indirimliFiyat*0.2)*2);
                System.out.println(ikinciIndirim+"TL");
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        if((yas>24 && yas < 65)&& ytipi==1){
            System.out.println(toplamFiyat+"TL");
        }else if(yas>24 && yas < 65){

            toplamFiyat = (int) (toplamFiyat - toplamFiyat*0.2);
            System.out.println(toplamFiyat+"TL");
        }
        }
    }


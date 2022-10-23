import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Doğum Tarihini gün ve ay olarak giriniz.");
        int gun = inp.nextInt();
        int ay = inp.nextInt();

       if(gun<0 && gun >31){
           System.out.println("Geçersiz gün girildi.");
       }
        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 21) {
                    System.out.println("Kova burcu");
                } else {
                    System.out.println("Oğlak burcu");
                }
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 28) {
                if (gun > 19) {
                    System.out.println("Balık burcu");
                } else {
                    System.out.println("Kova burcu");
                }
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 21) {
                    System.out.println("Koç burcu");
                } else {
                    System.out.println("Balık burcu");
                }
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 30) {
                if (gun > 21) {
                    System.out.println("Boğa burcu");
                } else {
                    System.out.println("Koç burcu");
                }
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun > 21) {
                    System.out.println("İkizler burcu");
                } else {
                    System.out.println("Boğa burcu");
                }
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 30) {
                if (gun > 22) {
                    System.out.println("Yengeç burcu");
                } else {
                    System.out.println("İkizler burcu");
                }
            }
        }else if(ay== 7){
            if (gun>= 1 && gun <= 31) {
                if (gun > 22) {
                    System.out.println("Aslan burcu");
                } else {
                    System.out.println("Yengeç burcu");
                }
            }
        }else if(ay == 8 ){
            if (gun >= 1 && gun <= 31) {
            if (gun > 22) {
                System.out.println("Başak burcu");
            } else {
                System.out.println("Aslan burcu");
            }
        }
        }else if(ay == 9){
            if (gun >= 1 && gun <= 30) {
            if (gun > 22) {
                System.out.println("Terazi burcu");
            } else {
                System.out.println("Başak burcu");
            }
        }
        }else if(ay == 10){
            if (gun >= 1 && gun <= 31) {
            if (gun > 22) {
                System.out.println("Akrep burcu");
            } else {
                System.out.println("Başak burcu");
            }
        }

        }else if(ay == 11){
            if (gun >= 1 && gun <= 30) {
                if (gun > 21) {
                    System.out.println("Yay burcu");
                } else {
                    System.out.println("Akrep burcu");
                }
            }
        }else if(ay == 12){
            if (gun >= 1 && gun <= 31) {
            if (gun > 21) {
                System.out.println("Oğlak burcu");
            } else {
                System.out.println("Yay burcu");
            }
        }
        }else{
            System.out.println("Geçersiz ay girildi.");
        }
    }
}
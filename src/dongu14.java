//1 - 100 arasındaki asal sayıları ekrana yazdıran program
public class dongu14 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int deneme = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    deneme = 1;
                    break;
                }
            }
            if (deneme == 0) {
                System.out.print(i + ",");
            }

        }
    }
}



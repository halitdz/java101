import java.util.Scanner;

public class ucSayiSiralama {
    public static void main(String[] args) {
        int s1,s2,s3,ebs = 0, eks = 0,gec=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sıralanacak 3 sayıyı giriniz.");
        s1 = inp.nextInt();
        s2 = inp.nextInt();
        s3 = inp.nextInt();
        if(s1 > s2 && s1 > s3 && s2 > s3) {
            ebs = s1;
            eks = s3;
            System.out.println(eks+"<"+s2+"<"+ebs);
        }else if( s2>s1 && s2 >s3 && s1>s3){
            ebs = s2;
            eks = s3;
            System.out.println(eks+"<"+s1+"<"+ebs);
        }else if(s3>s2 && s3>s1 && s2>s1){
                ebs = s3;
                eks = s1;
            System.out.println(eks+"<"+s2+"<"+ebs);
        }
    }
}

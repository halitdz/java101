import java.util.*;
import java.io.*;

class deneme{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j =0;j<n;j++) {
                double result = 0;
                result = (a+(Math.pow(2,j)*b));
                System.out.println(result);
               double result2 = result + (Math.pow(2,j)*b);
                System.out.println(result2);


            }
        }
        in.close();
    }
}
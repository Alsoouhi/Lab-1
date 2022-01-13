import java.util.Scanner;

/**
 * Created by Administrator on 1/10/2022.
 */
public class Sscanner {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] a=new int [5];

        for (int i = 0; i <a.length ; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print( a[i]+" ");

        }

    }
}

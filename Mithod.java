import java.util.Scanner;

/**
 * Created by Administrator on 1/10/2022.
 */
public class Mithod {
    static int[] in_put(int a[]){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            a[i]=in.nextInt();
    }
    return a;
    }
        static void out_put(int a[]){
            Scanner in=new Scanner(System.in);
            for (int i = 0; i <a.length ; i++) {
                System.out.print(a[i]+" ");
            }}


    public static void main(String[] args) {
        int [] a=new int [10];
        a=in_put(a);

        out_put(a);

    }}
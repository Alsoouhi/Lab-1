import java.util.Scanner;

/**
 * Created by Administrator on 1/10/2022.
 */
public class Manager {
    public static void main(String[] args) {
        Student [] team=new Student[5];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <team.length ; i++) {
            Student s=new Student(in.nextInt(),in.next());
            team[i]=s;}
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
    }
}}

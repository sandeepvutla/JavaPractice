package sandeep;
import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner scr=new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int n=scr.nextInt();
        int fact=1;
        /*for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);*/
        while(n>=1){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}

package sandeep;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[]args){
        Scanner scr=new Scanner (System.in);
        System.out.println("Enter number");
        int n=scr.nextInt();
        int reverse=0;
        int rem=0;
        while(n>0){
            rem=(n%10);
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println(reverse);
    }
}

package sandeep;
import java.util.Scanner;

public class Even_1_10 {
    public static void main(String[]args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=scr.nextInt();
        int sum=0;
        for (int i=1; i<=n;i++){
        if (i%2==0) {
            //System.out.println(i);
            sum=sum+i;

        }
        }
        System.out.println(sum);
    }
}

package sandeep;
import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[]args){
        Scanner scr=new Scanner (System.in);
        System.out.println("Enter New Number");
        int n= scr.nextInt();
        int sum=0;
        int i=1;

        while(i<=n){
            sum=sum+i;
            i++;
        }
System.out.println("sum of first "+n+" natural number :"+sum);

    }
}

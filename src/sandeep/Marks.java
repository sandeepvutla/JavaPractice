package sandeep;
import java.util.Scanner;

public class Marks {
    public static void main (String[]args){
        Scanner scr=new Scanner(System.in);
        int marks=scr.nextInt();
        if(marks<35)
        {
            System.out.println("fail");
        }
       
        if(marks>=35 && marks<=70)
        {
            System.out.println("third class");

        }
        if(marks>=70 && marks<=80) {
            System.out.println("second class");
        }
        if(marks>85)
        {
            System.out.println("first class");
        }

        }
    }


package sandeep;
import java.util.Scanner;
public class LoopPatterns {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a numer ");
        int n = scr.nextInt();
        int number=1;
        int numbers=1;
        //FIRST loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();//To print new line
        }
        //Second loop
        for (int a = 1; a <= n; a++) {

            // to print space
            for (int b = n - a; b > 0; b--) {
                System.out.print(" ");
            }
            //to print *
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
            }
            System.out.println();//To print new line
        }
       //3rd loop
       for (int d=1;d<=n;d++){
           for(int e=1;e<=d;e++){
               System.out.print(numbers);
               numbers=numbers+1;
           }
           System.out.println();//To print new line
       }
    //4th loop
        for (int f=1;f<=n;f++){
            for (int g=n-f;g>0;g--){
                System.out.print(".");
            }
            for (int h=1;h<=f;h++){
                System.out.print(number);
                number = number+1;
            }
            System.out.println();//To print new line
        }
    }
}

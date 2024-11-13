package sandeep;
import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[]args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number to check the given number is a palindrome or not");
        int n = scr.nextInt();
        int rem = 0;
        int rev = 0;
        int temp = n;
        while (n > 0) {
            rem = (n % 10);
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Given number is not a palindrome");
        }
    }
}

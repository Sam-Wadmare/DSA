
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scn.nextInt();
        int original = n;
        int lastdigit;
        int newn = 0;
        int count=0;
        while(n>0) {
            lastdigit = n%10;
            count++;
            n =n /10;
            newn = newn * 10 + lastdigit;
        }
        System.out.println("Length of number is : " + count);
        System.out.println("Reverse of number is : " + newn);
        if(original==newn) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
        scn.close();
    }
}

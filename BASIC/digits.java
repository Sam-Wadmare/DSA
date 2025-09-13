
import java.util.Scanner;



public class digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scn.nextInt();
        int lastdigit; 
        int count=0;

        while(n > 0) {
            lastdigit = n % 10;
            count = count +1;
            n=n/10;
        }
        System.out.println("Lenth of number is : "+ count);
        scn.close();
    }
}
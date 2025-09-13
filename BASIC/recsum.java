import java.util.Scanner;

public class recsum {
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        int total = recsum(n);
        System.out.println("Sum = " + total);
    }

    // static void recsum(int i) {
    //     if (i < 1) {
    //         return;
    //     }
    //     sum += i;
    //     recsum(i - 1);
    // }
    static int recsum(int n) {
        if (n == 0) {
            return 0;
        }
        
        return n + recsum(n-1);
    }
}

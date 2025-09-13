import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        scn.nextLine(); // consume leftover newline
        

        num(n,n);
    }

    static void num(int n, int i) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        num(n, i -1); // Recursive call with incremented i
    }
}

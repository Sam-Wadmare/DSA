public class factorial {
    public static void main(String[] args) {
        java.util.Scanner scn = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        scn.nextLine(); // consume leftover newline

        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    static int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}

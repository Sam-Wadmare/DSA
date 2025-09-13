import java.util.TreeSet;
public class divisors {
    public static void main(String[] args) {
        int n = 12; // Example number
        TreeSet<Integer> divisors = new TreeSet<>();
        System.out.println("Divisors of " + n + " are:");
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                divisors.add(i); // Add the divisor
                if (i != n / i) { // Avoid adding the square root twice
                    divisors.add(n / i); // Add the corresponding divisor
                }
            }
        }
        System.out.println("Divisors of " + n + " are: " + divisors);
        
    }
}

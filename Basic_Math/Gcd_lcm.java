package Basic_Math;

public class Gcd_lcm {
    public static void main(String[] args) {
        // GCD find using four approaches
        int num1 = 10, num2 = 35, gcd = 1;

        // 1st Approach: Brute Force
        for (int i = 1; i <= num1 && i <= num2; i++) { // Start from 1
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Update GCD
            }
        }

        System.out.println("GCD Brute Force" + gcd);

        // Add more approaches here if needed.
    }
}

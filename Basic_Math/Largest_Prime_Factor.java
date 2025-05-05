package Basic_Math;
public class Largest_Prime_Factor {
    public static long largestPrimeFactor(long n) {
        long m = (long) Math.sqrt(n);
        long ans = 0;

        for (long i = 2; i <= m; i++) {
            if (n % i == 0) {
                ans = Math.max(ans, i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        if (n > 1) {
            ans = n;
        }
        return ans;
    }
    public static void main(String[] args) {
      
        long number = 600851475143L; // Example input
        long largestFactor = largestPrimeFactor(number);
        System.out.println("The largest prime factor of " + number + " is: " + largestFactor);
    }
}

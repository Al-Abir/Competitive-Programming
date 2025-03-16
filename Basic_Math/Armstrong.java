package Basic_Math;

public class Armstrong {
   
    // Function to calculate power
    long power(long x, long y) {
        long ans = 1; // Initialize to 1 as the multiplicative identity.
        
        while (y > 0) {
            if ((y & 1) == 1) { // Check if exponent is odd
                ans *= x;  // Multiply the current base to the result
            }
            x *= x; // Square the base for the next iteration
            y >>= 1; // Divide the exponent by 2 (right shift)
        }
        return ans; // Return the result
    }
    
    // Function to calculate the number of digits in a number
    int order(int x) {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }

    // Function to check whether the given number is Armstrong number or not
    boolean isArmstrong(int x) {
        // Calling order function
        int n = order(x); // Get the number of digits
        long temp = x, sum = 0;
        while (temp != 0) {
            long r = temp % 10; // Get the last digit
            sum = sum + (long)Math.pow(r, n);
           // sum = sum + power(r, n); // Raise the digit to the power of n
            temp = temp / 10; // Remove the last digit
        }

        // If satisfies Armstrong condition
        return (sum == x);
    }

    // Driver Code
    public static void main(String[] args) {
        Armstrong ob = new Armstrong();
        int x = 153;
        System.out.println(ob.isArmstrong(x)); // Should print true
        x = 1253;
        System.out.println(ob.isArmstrong(x)); // Should print false
    }
}

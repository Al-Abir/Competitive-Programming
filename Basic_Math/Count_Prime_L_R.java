package Basic_Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Count_Prime_L_R {
    public static void main(String[] args) {
        int n = 1000000; // Set limit as needed

        // Step 1: Create sieve (prime = true)
        ArrayList<Boolean> sieve = new ArrayList<>(Collections.nCopies(n + 1, Boolean.TRUE));
        sieve.set(0, false);
        sieve.set(1, false);

        for (int i = 2; i * i <= n; i++) {
            if (sieve.get(i)) {
                for (int j = i * i; j <= n; j += i) {
                    sieve.set(j, false);
                }
            }
        }

        // Step 2: Create prefix sum array
        ArrayList<Integer> prefixSum = new ArrayList<>(Collections.nCopies(n + 1, 0));
        for (int i = 1; i <= n; i++) {
            prefixSum.set(i, prefixSum.get(i - 1) + (sieve.get(i) ? 1 : 0));
        }

        // Example query: Count primes in range [L, R]
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L and R: ");
        int L = sc.nextInt();
        int R = sc.nextInt();
        int result = prefixSum.get(R) - prefixSum.get(L - 1);
        System.out.println("Number of primes from " + L + " to " + R + " = " + result);
    }
}

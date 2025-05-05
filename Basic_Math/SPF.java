package Basic_Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SPF {
    static final int MAXN = 1000001;  // Adjust as per max input
    static int[] spf = new int[MAXN];

    // Precompute SPF (Smallest Prime Factor) for every number up to MAXN
    static void computeSPF() {
        for (int i = 0; i < MAXN; i++)
            spf[i] = i;

        for (int i = 2; i * i < MAXN; i++) {
            if (spf[i] == i) { // i is prime
                for (int j = i * i; j < MAXN; j += i) {
                    if (spf[j] == j)
                        spf[j] = i;
                }
            }
        }
    }

    // Function to get prime factorization using SPF
    static List<Integer> getFactorization(int x) {
        List<Integer> factors = new ArrayList<>();
        while (x != 1) {
            factors.add(spf[x]);
            x = x / spf[x];
        }
        return factors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computeSPF();

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter number to factorize: ");
            int n = sc.nextInt();
            List<Integer> factors = getFactorization(n);
            System.out.println("Prime factors: " + factors);
        }

        sc.close();
    }
}

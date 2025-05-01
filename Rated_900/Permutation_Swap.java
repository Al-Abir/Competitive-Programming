package Rated_900;

import java.util.Scanner;

public class Permutation_Swap {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            
            for (int i = 0; i < n; i++) {
                ans = gcd(ans, Math.abs(arr[i] - (i + 1)));
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

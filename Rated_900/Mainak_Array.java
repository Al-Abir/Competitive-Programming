package Rated_900;

import java.util.Scanner;

public class Mainak_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();  
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long ans = arr[n - 1] - arr[0];

            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, arr[i] - arr[0]);
            }

            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, arr[n - 1] - arr[i]);
            }

            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, arr[i] - arr[i + 1]);
            }

            System.out.println(ans);
        }
    }
}

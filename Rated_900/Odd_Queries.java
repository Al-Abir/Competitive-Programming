package Rated_900;
import java.util.ArrayList;
import java.util.Scanner;

public class Odd_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            ArrayList<Long> prefixSum = new ArrayList<>();
            prefixSum.add((long) arr.get(0));
            for (int i = 1; i < n; i++) {
                prefixSum.add(prefixSum.get(i - 1) + arr.get(i));
            }

            long totalSum = prefixSum.get(n - 1);

            while (q-- > 0) {
                int l = sc.nextInt() - 1; // Convert to 0-based
                int r = sc.nextInt() - 1; // Convert to 0-based
                long k = sc.nextLong();

                long segmentSum;
                if (l == 0) {
                    segmentSum = prefixSum.get(r);
                } else {
                    segmentSum = prefixSum.get(r) - prefixSum.get(l - 1);
                }

                long addSum = (r - l + 1) * k;
                long newSum = totalSum - segmentSum + addSum;

                if (newSum % 2 == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}
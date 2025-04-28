package Rated_900;

import java.util.Scanner;

public class Jellyfish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            int n = scanner.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
            }

            long maximum_time = b;
            for (int i = 0; i < n; i++) {
                maximum_time += Math.min(arr[i], a - 1);
            }
            System.out.println(maximum_time);
        }
        scanner.close();
    }
}

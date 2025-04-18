package Rated_800;
import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean alreadyUnsorted = false;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    alreadyUnsorted = true;
                    break;
                }
            }

            if (alreadyUnsorted) {
                System.out.println(0);
                continue;
            }

            int minDiff = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                int diff = arr[i] - arr[i - 1];
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }

            System.out.println((minDiff / 2) + 1);
        }
    }
}
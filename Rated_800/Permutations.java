package Rated_800;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((n == a && a == b) || a + b + 2 <= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

}

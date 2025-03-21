package Basic_Math;

import java.util.Scanner;

public class Park_Lighting {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

      
        int lanterns = (n * m + 1) / 2;

        System.out.println(lanterns);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}

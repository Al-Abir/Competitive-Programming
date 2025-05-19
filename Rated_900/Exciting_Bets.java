 package Rated_900;
import java.util.Scanner;

public class Exciting_Bets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                System.out.println(0 + " " + 0);
                continue;
            }

            long dif = Math.abs(a - b);
            
            long x = a % dif;
            long y = b % dif;

            if (x != y) {
                System.out.println(0 + " " + 0);
            } else {
                long ans = Math.min(x, dif - x);
                System.out.println(dif + " " + ans);
            }
        }
    }
}
package Rated_900;
import java.util.Scanner;

public class AB_Balance {
    public static void solve(Scanner sc) {
        String s = sc.next();
        int n = s.length();

        if (s.charAt(0) != s.charAt(n - 1)) {
            s = String.valueOf(s.charAt(n - 1) + s.substring(1));
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();

        while (tt-- > 0) {
            solve(sc);
        }
    }
}

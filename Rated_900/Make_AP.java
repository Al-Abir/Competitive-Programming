import java.util.Scanner;

public class Make_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();

        while (tt-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            boolean ok = false;

            // Case 1: Modify a
            long new_a = 2 * b - c;
            if (new_a > 0 && new_a % a == 0) {
                ok = true;
            }
            
            // Case 2: Modify b
            if ((a + c) % 2 == 0) {
                long new_b = (a + c) / 2;
                if (new_b > 0 && new_b % b == 0) {
                    ok = true;
                }
            }
            
            // Case 3: Modify c
            long new_c = 2 * b - a;
            if (new_c > 0 && new_c % c == 0) {
                ok = true;
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}
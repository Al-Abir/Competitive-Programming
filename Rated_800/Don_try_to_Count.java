import java.util.Scanner;

public class Don_try_to_Count {
    public static boolean check(String x, String s) {
        if (x.length() < s.length()) {
            return false;
        }
        for (int i = 0; i <= x.length() - s.length(); i++) {
            if (x.substring(i, i + s.length()).equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();  
            String s = sc.next();  

            long ans = -1;  
            String x0 = x;
            String x1 = x0 + x0;
            String x2 = x1 + x1;
            String x3 = x2 + x2;
            String x4 = x3 + x3;
            String x5 = x4 + x4;

            if (check(x0, s)) ans = 0;
            else if (check(x1, s)) ans = 1;
            else if (check(x2, s)) ans = 2;
            else if (check(x3, s)) ans = 3;
            else if (check(x4, s)) ans = 4;
            else if (check(x5, s)) ans = 5;

            System.out.println(ans);
        }
    }
}

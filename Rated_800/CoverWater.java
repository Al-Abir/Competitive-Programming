import java.util.Scanner;

public class CoverWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // Length of string
            String s = sc.next();  // Read the string without trailing newline
            int c = 0;
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                if (i + 2 < n && s.charAt(i) == '.' && s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.') {
                    flag = true;
                    break;
                }
                if (s.charAt(i) == '.') {
                    c++;
                }
            }

            if (flag) {
                System.out.println(2);
            } else {
                System.out.println(c);
            }
        }
        sc.close();
    }
}

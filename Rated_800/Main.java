package  Rated_800;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int one = 0, two = 0;
            List<Integer> v = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                if (b == 1) {
                    one++;
                } else {
                    two++;
                    v.add(i + 1);  
                }
            }

            if ((two & 1) == 1) {
                System.out.println(-1);
            } else {
                if (two == 0) {
                    System.out.println(1);
                } else {
                    int si = v.size() / 2 - 1;
                    System.out.println(v.get(si));
                }
            }
        }

        sc.close();
    }
}
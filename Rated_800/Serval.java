package Rated_800;
import java.util.*;

public class Serval {
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = false;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(gcd(arr[i], arr[j]) <= 2) {
                    flag = true;
                    break;
                }
            }
            
        }

        if(flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}

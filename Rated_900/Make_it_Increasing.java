package Rated_900;

import java.util.Scanner;

public class Make_it_Increasing {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            for(int i = n - 2; i >= 0; i--) {
                while (arr[i] != 0 && arr[i] >= arr[i + 1]) {
                    arr[i] /= 2;
                    ans++;
                }
                if (arr[i] >= arr[i + 1]) {
                    ans = -1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}

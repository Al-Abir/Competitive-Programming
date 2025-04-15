package Rated_800;

import java.util.Scanner;

public class Goals_Victory {
    public static void solve(Scanner sc){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n - 1; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n - 1; i++){
            sum += arr[i];
        }

        int ans = -sum;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            solve(sc);
        }
    }
}

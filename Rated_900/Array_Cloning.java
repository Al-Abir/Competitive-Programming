package Rated_900;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array_Cloning{

    public static void solve(Scanner sc) {  
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        int max_freq = 0;

   
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1); 
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            max_freq = Math.max(max_freq, entry.getValue());
        }

        int ans = 0;
        while (max_freq < n) {
            int rem = n - max_freq;
            int canAdd = max_freq;

            ans++;  
            int added = Math.min(canAdd, rem);
            ans += added;        
            max_freq += added;   
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);  
        }
    }
}

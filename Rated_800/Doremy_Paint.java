package Rated_800;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class Doremy_Paint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); 
            Map<Integer, Integer> freq = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

       
            if (freq.size() == 1) {
                System.out.println("YES");
            } 
         
            else if (freq.size() >= 3) {
                System.out.println("NO");
            } 
            else {
                
                List<Integer> counts = new ArrayList<>(freq.values());
                int count1 = counts.get(0); 
                int count2 = counts.get(1); 
                System.out.println(Math.abs(count1 - count2) <= 1 ? "YES" : "NO");
            }
        }

        sc.close();
    }
}

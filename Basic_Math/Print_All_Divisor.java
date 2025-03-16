package Basic_Math;

import java.util.*;

public class Print_All_Divisor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                arr.add(i);
                if (i != n / i) {
                    arr.add(n / i);
                }
            }
        }

        // Correct way to sort an ArrayList
        Collections.sort(arr);

        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}

package Basic_Math;

import java.util.Scanner;

public class Array_Odd_Sum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            
            int sum = 0;
            boolean hasEven = false;
            boolean hasOdd = false;
            
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
                
                if (arr[i] % 2 == 0) {
                    hasEven = true;
                } else {
                    hasOdd = true;
                }
            }

            
            if (sum % 2 != 0 || (hasEven && hasOdd)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

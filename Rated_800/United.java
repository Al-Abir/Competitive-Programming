package Rated_800;
import java.util.ArrayList;
import java.util.Scanner;

public class United{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
    
            int max = Integer.MIN_VALUE;
            for (int num : a) {
                if (num > max) {
                    max = num;
                }
            }
            
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            for (int num : a) {
                if (num != max) {
                    b.add(num);
                } else {
                    c.add(num);
                }
            }
            
            if (b.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());
                for (Integer num : b) {
                    System.out.print(num + " ");
                }
                System.out.println();
                for (Integer num : c) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
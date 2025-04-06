import java.util.ArrayList;
import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(0);  
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt(); 
                arr.add(num);
            }

            arr.add(x);  
            n = arr.size(); 

            int max_distance = Integer.MIN_VALUE;

            for (int i = 1; i < n; i++) {
                if (i == n - 1) {
                    
                    max_distance = Math.max(max_distance, 2 * (x - arr.get(i - 1)));
                } else {
                   
                    max_distance = Math.max(max_distance, arr.get(i) - arr.get(i - 1));
                }
            }

            System.out.println(max_distance);
        }

        sc.close();
    }
}

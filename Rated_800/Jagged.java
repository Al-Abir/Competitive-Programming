import java.util.ArrayList;
import java.util.Scanner;

public class Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int n = sc.nextInt();  
            ArrayList<Integer> arr = new ArrayList<>(n);  

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt()); 
            }
            if (arr.get(0) != 1) {  
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}

package Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class Third_side {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
           
            for (int i = 0; i < a; i++) {
                arr.add(sc.nextInt());
            }
            
            while (arr.size() > 1) {
                int sum = arr.get(arr.size() - 1) + arr.get(arr.size() - 2) - 1;
                arr.remove(arr.size() - 1);  
                arr.remove(arr.size() - 1);  
                arr.add(sum);  
            }
            

            System.out.println(arr.get(0));
        }
    }
}


 package Implementation;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        
        while (T-- > 0) {
            int a = sc.nextInt();  
            int b = sc.nextInt(); 
            int n = sc.nextInt();
            int operations = 0;  
            
            while (a<=n && b <=n) {
                if (a > b) {
                    b += a;  
                } else {
                    a += b;  
                }
                operations++;  
            }
            
            System.out.println(operations);  
        }
        
        sc.close(); 
    }
}


package Rated_900;
import java.util.Scanner;

public class ComparisonString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); 
            String s = sc.next(); 
            int maxSeq = 0;
            int currentSeq = 0;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '<') {
                    currentSeq++;
                } else {
                    currentSeq = 0;
                }
                maxSeq = Math.max(maxSeq, currentSeq);
            }
            
            currentSeq = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '>') {
                    currentSeq++;
                } else {
                    currentSeq = 0;
                }
                maxSeq = Math.max(maxSeq, currentSeq);
            }
            
            System.out.println(maxSeq + 1);
        }
    }
}

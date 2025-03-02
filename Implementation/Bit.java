package Implementation;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int x = 0;

        while (T-- > 0) {
            String statement = sc.next();
            if (statement.contains("++")) x++;
            else x--;
        }

        System.out.println(x);
        sc.close(); 
    }
}

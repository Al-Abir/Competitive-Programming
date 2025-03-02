package Implementation;

import java.util.Scanner;

public class Meeting {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

          int distace1 = Math.abs(x1-x2);
          int distace2 = Math.abs(x1-x3);
          int distace3 = Math.abs(x2-x3);

          int ans = Math.max(distace1, Math.max(distace2,distace3));
          

          System.out.println(ans);


        }
    
}

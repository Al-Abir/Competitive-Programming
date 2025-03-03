package Implementation;

import java.util.Scanner;

public class Easy {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int a =sc.nextInt();
           if(a==1){
               System.out.println("HARD");
               return;
        }
        }
        System.out.println("EASY");
      }
}

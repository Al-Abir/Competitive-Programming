package Pattern;

import java.util.Scanner;

public class tran_3 {
   public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      
      int n= sc.nextInt();

      for(int i=1; i<=n ; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print("* ");
        }
        System.out.println();
      }
   } 
}

package Basic_Math;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor {
    public static int isPrime(int n) {
        if (n < 2) return -1; 

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return -1; 
        }
        return 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
      
        for (int i = 2; i <= n; i++) {
            
                if (isPrime(i) == 1) {
                    arr.add(i); // Adding divisor if prime
                
                if((n/i) !=i){
                    if(isPrime(n/i)==1){
                        arr.add(n/i);
                 }
                }
            }
        }
        
        
        for (int prime : arr) {
            System.out.println(prime);
        }

        sc.close();
    }
}

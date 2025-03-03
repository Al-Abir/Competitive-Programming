package Implementation;

import java.util.Scanner;

public class Arrival{
  

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
    
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxIndex = 0, minIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
                if (arr[i] <= arr[minIndex]) { 
                    minIndex = i;
                }
            }
    
            int swaps = maxIndex;  
            swaps += (n - 1 - minIndex); 
    
            if (minIndex < maxIndex) {
                swaps -= 1;
            }
    
            System.out.println(swaps);
            sc.close();
        }
    }
    


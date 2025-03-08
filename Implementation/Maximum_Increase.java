package Implementation;

import java.util.Scanner;

public class Maximum_Increase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }

         int maximum =1;
         int currentLength =1;

         for(int i =1; i<arr.length;i++){
              if(arr[i]>arr[i-1]){
                 currentLength++;
                 maximum = Math.max(maximum, currentLength);
              }else{
                currentLength=1;
              }
         }
         System.out.println(maximum);

      
    }
}

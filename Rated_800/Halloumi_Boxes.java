package Rated_800;

import java.util.Scanner;

public class Halloumi_Boxes {
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-->0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();

            int arr[] = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i]= sc.nextInt();
            }
            
            if(k>1) System.out.println("YES");
            else{
                boolean sorted= true;
                for(int i=1; i<arr.length; i++){
                    if(arr[i]<arr[i-1])
                    {
                        sorted= false;
                        break;
                    }

                }

                System.out.println(sorted?"YES":"NO");

            }
    }
}

}

package Implementation;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int operation = sc.nextInt();

        for(int i =1; i<=operation; i++){
            int temp = n%10;
            if(temp!=0){
                n--;
            }else{
                n/=10;
            }
        }
        System.out.println(n);
        sc.close();
    }
}

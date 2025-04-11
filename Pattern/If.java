package Pattern;

import java.util.Scanner;

public class If{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        if(N%2!=0){
            System.out.print("Weird");
        }else{
            if(N>=2 && N<=5){
                System.out.print("Not Weird");
            }else if(N>=6 && N<=20){
                System.out.print("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }

      
    }
}

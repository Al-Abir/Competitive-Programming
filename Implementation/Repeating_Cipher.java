package Implementation;

import java.util.Scanner;

public class Repeating_Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String t = sc.next(); 
        StringBuilder str = new StringBuilder();
        for(int i=0, step=1; i<n ; i+=step, step++){
                str.append(t.charAt(i));
        }

        System.out.println(str.toString());
    }
}

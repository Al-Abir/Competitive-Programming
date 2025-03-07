package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Helpul_Maths {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        /* 
         char [] chars = s.toCharArray();
        
         Arrays.sort(chars);
        // 1 2 3 + +
        StringBuilder result = new StringBuilder();
        for(char c:chars){
            if(c!='+'){
                if(result.length()>0){
                      result.append("+");
                }
                result.append(c);

            }
           

        }
        System.out.println(result.toString()); */

       String number[] = s.split("\\+");

       Arrays.sort(number);

       String result = String.join("+",number);
       System.out.println(result);


    }
}


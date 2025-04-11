package Recursion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Set<Character> unique = new HashSet<>();   
        StringBuilder result = new StringBuilder();
        
        
        for(char c : str.toCharArray()){   
           if(!unique.contains(c)){
             unique.add(c);
             result.append(c);
           }

       }
       System.out.println(result.toString()+" ");    
    }
}

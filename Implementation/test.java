package Implementation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String word = sc.nextLine();
       boolean[]seen = new boolean[26];
       int uniqueCount=0;
       for(char c : word.toCharArray()){
           int index = c-'a';
           if(!seen[index]){
               seen[index] =true;
               uniqueCount++;
           }
       }
       if(uniqueCount%2==0){
         System.out.println("YES");
       }else{
        System.out.println("NO");
       }
    }
}

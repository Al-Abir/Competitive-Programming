package Implementation;

import java.util.Scanner;

public class Chewbaсca {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String  x = sc.next();
        String ans ="";
        sc.close();

        for(int i=0; i<x.length(); i++){

            char c = x.charAt(i);
            if(c=='9' && i==0){
               ans+= ""+c;
            }else if(c<'5'){
                ans = ans +""+ c;
            }else{
                ans = ans+""+('9'-c);
            }
        }
        System.out.println(ans);
       

    }
}
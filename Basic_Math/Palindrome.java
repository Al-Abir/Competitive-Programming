package Basic_Math;

public class Palindrome {
    public static void main(String[] args) {
        int n =1231;
        int dp = n;
         int ans=0;
        while (n>0) {
            
            int last = n%10;
            
            ans= (ans*10) +last;
            n/=10;   
        }
    
        if(ans==dp){
            System.out.println("Palinedrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}

package Basic_Math;

public class Power {
    public static int powerCalculation(int a , int pow){
        int ans=1;
        if(pow==0){
            return 1;
        }
        while(pow>0){
            if(pow%2==1){
               ans= ans*a;
               pow = pow-1;
           }else{
               pow = pow/2;
               a = a*a;
           }
          
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int a =2;
        int pow =2;
        System.out.println(powerCalculation(a,pow));
    }
}

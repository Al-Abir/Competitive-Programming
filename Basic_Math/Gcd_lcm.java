package Basic_Math;

public class Gcd_lcm {
    public static int gcd_find(int num1, int num2){
        if(num2==0){
            return num1;
        }
           return gcd_find(num2, num1%num2);
    }
    public static void main(String[] args) {
        // GCD find using four approaches
        int num1 = 10, num2 = 35;

       /*  // 1st Approach: Brute Force
        for (int i = 1; i <= num1 && i <= num2; i++) { // Start from 1
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Update GCD
            }
        }

        System.out.println("GCD Brute Force" + gcd);
        */
        /*  2nd Approach: while loop
        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }else{
                num2=num2-num1;
            }
        }
        System.out.println(num2);
       */

       /*3rd Approach temp 
       while(num2!=0){
            int temp = num2;
            num2=num1%num2;
            num1= temp;
       }
       System.out.println(num1);
        */
      //  4th Approach recusion
       /* int ans= gcd_find(num1, num2);
        System.out.println(ans);

        //lcm 2 approach

        int lcm = (num1*num2)/ans;
        System.out.println(lcm);
        */
        // brute force 
        int first_Common_divisor = (num1>num2)?num1:num2;
        
        while(true){
            if(first_Common_divisor%num1 ==0 && first_Common_divisor%num2==0){
                break;
            }
            first_Common_divisor++;
        }
        System.out.println(first_Common_divisor);

     

    }
}

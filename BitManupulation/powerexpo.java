package BitManupulation;

public class powerexpo{
    public static int power(int a, int pow){
        int ans =1;

        while(pow>0){
            if((pow &1 ) != 0){
                ans = ans * a;
            }
            a = a * a;
            pow= pow>>1;

        }
        return ans;
    }
    public static void main(String[] args) {
        
        System.out.println(power(2,5));
    }
}
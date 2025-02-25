package Basic_Math;

public class Modular {
    public static long mod(long a, long b, long mod) {
        long ans = 1;
        a = a % mod; 
        
        while (b > 0) {
            if ((b & 1) != 0) { 
                ans = (ans * a) % mod;
                b= b-1;
            }else{
                a = (a * a) % mod; // Square 'a'
                b = b >> 1; // Divide b by 2
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mod(397843, 5, 100000007)); // Expected output: 46821493
    }
}

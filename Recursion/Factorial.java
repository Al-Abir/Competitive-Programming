package Recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int var = fact(n-1);
        return n * var;
    }
    public static void main(String[] args) {
          int n=5;
          System.out.println(fact(n));
    }
}

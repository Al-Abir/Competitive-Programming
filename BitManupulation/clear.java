package BitManupulation;

public class clear{
    public static int clearlastI_bits(int n, int i){
               int bitmask = (-1)<<i;

               return n & bitmask;
    }
    public static int clearBit(int n, int pos){

        int bitmask = ~(1<<pos);
        return n & bitmask;
    }
    public static int clearBit_range(int n, int j, int i){
        int a  = (-1)<<j+1;
        int b = (1<<i)-1;
        
    }
    public static void main(String[] args) {
        
        int n =15;
        int pos =2;
        System.out.println(clearBit(n,pos));
        System.out.println(clearlastI_bits(n, pos));
        System.out.println(clearBit_range(10,4,2));

    }
}
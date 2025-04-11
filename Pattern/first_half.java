package Pattern;

public class first_half {
    public static void main(String[] args) {
           int n=5;
           for(int i=n; i>=1; i--){
            //space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //start print
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
       }
           for(int i=2; i<=n; i++){
                //space 
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //start print
                for(int k=1; k<=2*i-1; k++){
                    System.out.print("*");
                }
                System.out.println();
           }
         
    }
}

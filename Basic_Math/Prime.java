package Basic_Math;

public class Prime {
    public static void main(String[] args) {
        int n =3;

        int cnt =0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                cnt++;

                if((n/i) !=i){
                    cnt++;
                }
                if(cnt>2) break;
            }
        }
        if(cnt==2){
            System.out.println("This prim number");
        }else{
            System.out.println("This not a prime Number");
        }
    
    }
}

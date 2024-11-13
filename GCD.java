import java.util.*;
public class GCD {
    public static int gcd(int m,int n) {
        while(m!=n){
            if(m>n){
                m=m-n;
            }else{
                n=n-m;

            }
           
        }return m;
        
        
    }
    public static void main(String args[]){
        System.out.print(gcd(25,15));
    }
    
}

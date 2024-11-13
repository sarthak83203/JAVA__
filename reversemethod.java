import java.util.*;
public class reversemethod {
    public static int reverseofno(int n){
        int rev=0;
        int r;
        while(n!=0){
            r=n%10;
            rev=rev*10+r*r*r;
            n=n/10;
            
        }
        return rev;
    }
    public static void main(String args[]){
        System.out.print(reverseofno(172));

    }
    
}

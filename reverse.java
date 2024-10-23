import java.util.*;
class reverse {
    public int reverse(int x) {
        int r;
        int rev=0;
        if(x>0) {
            while(x>0){
                r=x%10;
                rev=rev*10+r;
                x=x/10;
               
    
            }
        }else if(x<0) {
            x=-x;
            while(x>0){
                r=x%10;
                rev=rev*10+r;
                x=x/10;

               
    
            }
            rev=-rev;

        }
        return rev;

        
        
       
        
   }
}
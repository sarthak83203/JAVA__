import java.util.*;
public class primenumberusingmethod {
     static int checkprime(int p){
        
        for (int i=2;i<=p/2;i++){
            if(p%i==0){
                return false;
            }
            return true;
           
        
    }
   
    }
    public static void main(String args[]){
       
        System.out.println(checkprime(2));
        
} 
}
    


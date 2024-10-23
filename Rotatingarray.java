import java.util.*;
public class Rotatingarray {
    public static void main(String args[]) {
        int [] A={5,9,6,10,12,7,3,5,4,2};
        for(int x:A)      
        System.out.print(x+",");
        System.out.println("");
        int temp=A[A.length];
        for(int i=A.length;i>1;i--) {
            A[i]=A[i-1];
          
        }
        temp=A[0];
       
        for(int x:A)      
        System.out.print(x+",");
        System.out.println("");
    
    }
    
}

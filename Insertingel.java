import java.util.*;
public class Insertingel {
    public static void main(String args[]) {
        int [] A ={1,2,3,4,5,6,7};
        for(int i=A.length;i>0;i--) {
            A[i]=A[i-1];
            A[2]=15;
            System.out.println(A[i]);


        }
        
    }
    
}

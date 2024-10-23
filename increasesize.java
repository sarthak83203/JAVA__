import java.util.*;
public class increasesize {
    public static void main(String args[]){
        int[] A={1,2,3,4,5,6,7,8,9};
        System.out.println(A.length);
        int [] B= new int[2*A.length];
        
        for(int i =0;i<=A.length-1;i++){
            B[i]=B[i]+A[i];
            

        }A=B;
        B=null;
        System.out.print(A.length);
    }
    
}

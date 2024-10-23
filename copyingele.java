import java.util.*;
public class copyingele {
    public static void main(String args[]){
        int[] A={1,2,3,4,5,6,7,8,9};
        int[] B= new int[9];
        for(int i=0;i<A.length;i++){
            B[i]=A[i]+B[i];
        }for(int x:B){
            System.out.print(x+" ");
            System.out.print(" ");
        }
    }
    
}

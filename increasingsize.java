import java.util.*;
public class increasingsize {
    public static void main(String args[]){
        int [] A={1,2,3,4,5,6,7,8,9};
        int []B= new int[12];
        for (int i=0;i<A.length;i++){
            B[i]=B[i]+A[i];


        }A=B;
        B=null;
        System.out.println(A.length);
    }
    
}

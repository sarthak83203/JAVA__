import java.util.*;
public class deletingele {
    public static void main(String args[]){
        int[] A=new int[7];
        A[0]=3;
        A[1]=0;
        A[2]=9;
        A[3]=8;
        A[4]=5;
        A[5]=2;
        
        for(int i=2;i<=A.length-1;i++){
            A[i-1]=A[i];

        }for(int x:A){
            System.out.print(x+" ");
            System.out.print(" ");
        }
        
    }
    
}

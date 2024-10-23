import java.util.*;
public class insertingele {
    public static void main(String args[]){
        int[] A= new int[7];
        A[0]=3;
        A[1]=8;
        A[2]=7;
        A[3]=6;
        A[4]=5;
        A[5]=9;
        for(int i=A.length-1;i>=4;i--){
            A[i]=A[i-1];


        }A[4]=15;
        for(int x:A){
            System.out.print(x+" ");
            System.out.print(" ");
        }


    }

    
}

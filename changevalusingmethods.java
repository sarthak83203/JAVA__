import java.util.*;
public class changevalusingmethods {
    static void change(int [] B,int index,int value){
        B[index]=value;
    }
    public static void main(String args[]){
        int [] A={1,2,3,4,5,6,7,8,9};
        change(A,4,70);
        for(int x:A){
            System.out.print(x+" ");
            System.out.print(" ");
        }
    }
    
}

import java.util.*;
public class Searchingele {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] A= {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<A.length;i++){
            if(A[i]==n){
                break;
            }else{
                System.out.print(A[i]+" ");
            }

        }
        
    }
    
}

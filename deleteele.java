import java.util.*;
public class deleteele {
    public static void main(String args[]) {
        int [] n= new int[10];
        n[0]=1;n[1]=2;n[2]=3;n[3]=4;n[4]=5;n[5]=6;
        int p=6;
        for (int i=0;i<p;i++)
            System.out.print(n[i]+",");
        System.out.println(""); 
        
        int index=2;
        int x=2;
        for(int i=0;i<index;i++)
            n[2]=0;
            n[i-1]=n[i];

        for (int i=0;i<p;i++)
            System.out.print(n[i]+",");
        System.out.println("");     
        
        
        

    }
    
}

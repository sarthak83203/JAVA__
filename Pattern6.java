import java.util.*;
public class Pattern6 {
    public static void main( String args[]) {
        int a =5;
        for (int i =1; i<=a;i++) {
            int spaces = (a-i);
            for (int j= 1; j<=spaces; j++) {
                System.out.print(" ");    
            } for ( int j = 1; j<=5; j++) {
                System.out.print("*"); 
            } System.out.println();  
        }
      
          
        
    }
}
import java.util.*;
public class Pattern7 {
    public static void main(String args[]) {
        int a = 4;
        for (int i = 1; i<=1; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
             } 
             int spaces = 2*(a-i);
            for ( int j= 1;j<= spaces;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("*");    
            
        }System.out.println();
    }
    for (int i = a; i>=1; i--) {
        for (int j = 1; j<=i; j++) {
            System.out.print("*");
         } 
         int spaces = 2*(a-i);
        for ( int j= 1;j<= spaces;j++) {
            System.out.print(" ");
        }
        for (int j = 1; j<=i; j++) {
            System.out.print("*");    
        
    }System.out.println();
}System.out.println();
}
}
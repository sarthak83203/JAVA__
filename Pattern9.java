import java.util.*;
public class Pattern9 {
    public static void main(String args[]) {
        int a = 4;
      
        for ( int i = 1; i<=a; i++) {
            int spaces = (a-i);
            for (int j = 1; j<=spaces;j++)  {
                System.out.print( " ");
            }
            for (int j = 1; j<=2*i-1;j++) {
                System.out.print("*");

            }System.out.println();

            


        }
        for ( int i = a; i>=1; i--) {
            int spaces = (a-i);
            for (int j = 1; j<=spaces;j++)  {
                System.out.print( " ");
            }
            for (int j = 1; j<=2*i-1;j++) {
                System.out.print("*");

            }System.out.println();

            


        }

    }


}
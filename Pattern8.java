import java.util.*;
public class Pattern8 {
    public static void main( String args[]) {
        int a = 5;
        for (int i = 1; i<=a;i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");

            }System.out.println();
        } //stage 2

       for (int i = 1; i<=a ; i++) {
        int spaces = a-i;
            for (int j=1; j<=spaces; j++) {
                System.out.print( " ");

            }
            for (int j= 2; j<=i; j++) {
                System.out.print( j+ " ");
            }System.out.println();
        }


    }
}
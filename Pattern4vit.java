import java.util.*;
public class Pattern4vit {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int spaces=n-i;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
    
        } 
    }
}
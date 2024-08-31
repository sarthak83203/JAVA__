import java.util.*;
public class Pop {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        int m=n;
        int r;
        int rev=0;
        while(n>0) {
            r= n%10;
            rev= rev*10+r;
            n=n/10;

        }if (rev==m) {
            System.out.println("The number is in palindrome");
        } else {
            System.out.println("The number is not an palindrome");
        }System.out.println();
        
        
    }
}
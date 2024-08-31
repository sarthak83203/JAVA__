import java.util.*;
public class Myconvension {
    public static int Evenno(int n) {
        
        if (n%2==0) {
            System.out.println("The Number is Even");
        }else{
            System.out.println("Non Even Number");
        }
        return n ;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Evenno(n);
    }
}
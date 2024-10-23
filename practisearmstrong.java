import java.util.*;
public class practisearmstrong {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int m=n;
        int r;
        for(int i=n;i>=1;i--) {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;



        }
        if(sum==m) {
            System.out.println("Yes its an armstrong number");
        }else{
            System.out.println("No its not an armstrong number");
        }
       
    }
    
}

import java.util.*;
public class Aarti123 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter length, breath and height ");
        int length = sc.nextInt();
        int breath = sc.nextInt();
        int height = sc.nextInt();
        int totalArea;

        totalArea=2*(length*breath+breath*height+height*length);
        System.out.println("Total Area " +totalArea);

    }
}

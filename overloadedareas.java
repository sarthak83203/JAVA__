import java.util.*;
public class overloadedareas {
    public static double areaofcircle(double r){
        return Math.PI*r*r;
    }public static int areaofrectangle(int l, int b){
        return l*b;

    }
    public static void main(String args[]){
        System.out.println(areaofcircle(22));
        System.out.println(areaofrectangle(85,25));
    }
    
}

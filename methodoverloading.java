import java.util.*;
public class methodoverloading {
    public static int max(int m,int n){
        return m>n?m:n;
    }
    public static float min(int m, int n){
        return m<n?n:m;
    }
    public static void main(String args[]){
        System.out.println(min(15,78));
    }
    
}

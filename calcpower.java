import java.util.*;

public class calcpower {
    public static double raiseToPower(int x , int n){
        double p =Math.pow(x,n);
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        double p = raiseToPower(x, n);
        System.out.println(p);
    }

}
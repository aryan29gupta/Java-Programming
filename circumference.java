import java.util.*;

public class circumference {
    public static double radius(int r){
        double c = 3.14 * 2 * r;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        double c = radius(r);
        System.out.println("The circumference of circle of given radius is :  "+c );

    }
}


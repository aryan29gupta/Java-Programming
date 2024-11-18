import java.util.*;

public class gcd {

    public static void greatestCommonDivisor(int a , int b){
        int c;
        int k=0;
        if (a>b){
            c = b;

        }
        else {
            c = a;

        }

        for(int i = 1 ; i <= c ; i++){
            if (a%i==0){
                if (b%i==0){
                    k=i;

                }
            }
        }
        System.out.println("greatest common divisor is "+k);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatestCommonDivisor(a,b);

    }

}
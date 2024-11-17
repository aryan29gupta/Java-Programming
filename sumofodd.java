import java.util.*;

public class sumofodd {
    public static int OddNumSum(int n){
        int sum = 0;
        for (int i=1;i<=n;i=i+2)  {
            sum = sum + i ;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = OddNumSum(n);


        System.out.println("Sum of first n odd numbers is : "+sum);
    }


}
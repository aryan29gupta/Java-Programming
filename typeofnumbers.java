import java.util.*;

public class typeofnumbers {
    public static void main (String args[]) {
        System.out.println("enter numbers");
        int p = 0;
        int n = 0;
        int zero = 0;
        while(true){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a>0){
                p+=1;

            }
            else if(a<0){
                n+=1;

            }
            else{
                zero+=1;
            }

            System.out.println("do you wish to enter another number , press y/n ");
            String x = sc.next();
            String word = "n";


            if (x.equals(word)){
                System.out.println("number of positive numbers are "+p);
                System.out.println("number of negative numbers are "+n);
                System.out.println("number of zeroes are "+zero );
                break;


            }


        }


    }

}
import java.util.*;

public class vote {
    public static String eligibleToVote( int age ){
        if (age>=18){
            String a = "eligible to vote" ;
            return a;


        }
        else{
            String a = "not eligible to vote";
            return a;

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        String a = eligibleToVote(age);
        System.out.println(a);
    }
    
}
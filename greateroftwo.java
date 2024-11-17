import java.util.*;
public class greateroftwo {
    public static void greater(int a,int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(a==b) {
            System.out.println("both are equal");
        }
        else{
            System.out.println(b+" is greater than "+a);
        } 
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greater(a,b);
    }
}

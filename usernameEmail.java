import java.util.*;

public class usernameEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email id : ");
        String str = sc.next();

        for (int i=0 ; i < str.length() ; i++){
            if(str.charAt(i)=='@'){
                int a = i;
                String strUser = str.substring(0,a);
                System.out.println("The username from the EmailId is : " +strUser);
                break;
            }
        }
    } 
}
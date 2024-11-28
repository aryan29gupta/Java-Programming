import java.util.*;

public class Replace_char{
    public static void main(String[] args) {
        System.out.println("Enter a string");
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for (int i=0 ; i<str.length() ; i++){
            char a = str.charAt(i);
            if (a == 'i'){
                result+='e';
            }
            else{
                result+=str.charAt(i);
                
                }

            }
            System.err.println("NEW STRING IS");
            System.out.println(result);
        }
    }

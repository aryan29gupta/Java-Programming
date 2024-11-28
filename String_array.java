import java.util.*;
public class String_array{
    public static void main(String[] args) {
        System.out.println("Size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String strArray[] = new String[size];
        String newStr="";

        for (int i = 0 ; i < size ; i++){
            System.out.println("Enter string at index "+i);
            String str = sc.next();
            strArray[i] = str;

        }

        for ( int i = 0 ; i < strArray.length ; i++ ){
            newStr += strArray[i];
        }

        System.out.println("The length of all the strings in the array sum up to  "+ newStr.length());
    }
}
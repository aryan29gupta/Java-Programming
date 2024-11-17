import java.util.*;
public class averageofthree {
    public static int avgThree(int a , int b , int c ){
        int avr= (a+b+c)/3;
        return avr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avr= avgThree(a,b,c);
        System.out.println("AVERAGE OF THREE NUMBERS IS : "+ avr);

    }


}
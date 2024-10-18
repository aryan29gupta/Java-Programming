import java.util.*;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        { System.out.println("Enter two numbers");
        }         
        int a = sc.nextInt();
        int b = sc.nextInt();
        {
                        System.out.println("Enter choice\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        }

        int operation = sc.nextInt();

        switch (operation) {
            case 1: {
                System.out.println("Addition case");
                int c = a+b;
                System.out.print("The sum is  ");
                System.out.println(c);
                break;
            }
            case 2: {
                System.out.println("Subtration case");
                int d = a-b;
                System.out.print("The difference is  ");
                System.out.println(d);
                break;
            }
            case 3: {
                System.out.println("Multiplication case");
                int m = a*b;
                System.out.print("The product is  ");
                System.out.println(m);
                break;
            }
            case 4: {
                System.out.println("Division case");
                int q= a/b;
                System.out.print("The quotient is  ");
                System.out.println(q);
                break;
            }
            default :
                System.out.println("INVALID CASE");
        }
    }
}
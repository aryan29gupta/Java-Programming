import java.util.*;

public class check_Ascending{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int number[]= new int[size];

        for (int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        int counter=1;
        
        for(int i=0; i<size-1; i++){
            if ( number [i] > number [i+1]){
                counter=0;
            }
        }

        if (counter==1){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
        

import java.util.*;

public class max_min_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int number[]= new int[size];

        for (int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        int max=number[0];
        int min=number[0];

        for (int i = 0; i < number.length; i++){
            if (number[i]>max){
                max=number[i];
            }
            if (number[i]<min){
                min=number[i];    
            }
        }
        System.out.println("Maximum number in the array is  "+max);    
        System.out.println("Minimum number in the array is  "+min);    

    }
}
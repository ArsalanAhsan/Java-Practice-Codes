import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinArray {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int inputArray[] = new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }

        int max = inputArray[0];
        int min =inputArray[0];
        for(int i=0;i<size;i++){
            if(inputArray[i]>max){  
                max = inputArray[i];
            }
            else if(inputArray[i]>min && inputArray[i]!=max ){
                min = inputArray[i];
            }
        }
        System.out.println("Maximum value in array: "+max);
        System.out.println("Min "+min);


    }
    
}

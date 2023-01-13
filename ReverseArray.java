import java.util.Arrays;
import java.util.Scanner;


public class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int inputArray[] = new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        int temp;
        int start = 0;
        int end = size-1;
        while(start<end){
            temp=inputArray[start];
            inputArray[start]=inputArray[end];
            inputArray[end]=temp;

            start++;
            end--;


        }
       System.out.println( Arrays.toString(inputArray));
    }
    
}

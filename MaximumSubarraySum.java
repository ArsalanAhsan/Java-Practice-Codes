import java.util.Scanner;
public class MaximumSubarraySum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int inputArray[] = new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        int maxSum = inputArray[0];
        int sum = inputArray[0];
        for(int i=1;i<size;i++){
            if(sum<0){
                sum=inputArray[i];
            }
            else{
                sum=sum+inputArray[i];
            }
            maxSum=Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }

    
}

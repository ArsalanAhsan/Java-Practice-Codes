public class SumfromArray {
    public static void main(String args[]) {
        int arr[] = {2,4,1,8,9};
        int sum = 5;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+arr[i+1]==sum){
                System.out.println("equal");
            }
        }
    }


    
}

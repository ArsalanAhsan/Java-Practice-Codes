import java.util.*;

public class Array {
    public static void main(String args[]) {
       int[] num = {1,2,1,2,4};
       for (int i =0 ;i<num.length;i++){
        for(int j=0;j<num.length;j++){
            if(num[i] == num[j] && i == j)
            {
                System.out.println(num[j]);
            }
        }
        
       }

    }

}

import java.*;
public class Solution {
    public static void main(String args[]) {
        int ans = 0;
        int[] prices = {7,1,5,3,6,4}; 
        int minimumSoFar = prices[0];
        for(int i=1;i<prices.length;i++){
            int currentProfit = prices[i]-minimumSoFar;
            if(currentProfit > ans){
                ans = currentProfit;
            }
            minimumSoFar = Math.min(minimumSoFar,prices[i]);
        }
        System.out.println(ans);
        
    }
}
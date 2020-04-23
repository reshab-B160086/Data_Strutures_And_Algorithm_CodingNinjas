/*You have made a smartphone app and want to set its price such that the profit earned is maximised. There are certain buyers who will buy your app only if their budget is greater than or equal to your price.
You will be provided with a list of size N having budgets of buyers and you need to return the maximum profit that you can earn.
Lets say you decide that price of your app is Rs. x and there are N number of buyers. So maximum profit you can earn is :*/

import java.util.Arrays;
public class solution {

    public static int maximumProfit(int budget[]) {
        // Write your code here
       
        Arrays.sort(budget);
        
        int amount = 0;
        int newamount;
        for(int i=0;i<budget.length;i++){
            newamount = budget[i] * (budget.length-i);
            if(newamount > amount){
                amount = newamount;
            }
        }
        
        return amount;
        
        
    }

}
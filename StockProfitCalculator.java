import java.util.*;

public class StockProfitCalculator {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
       
       int n= sc.nextInt();

       
        int[] prices = new int[n];

        
        
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }

        
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);

        sc.close();
    }
}
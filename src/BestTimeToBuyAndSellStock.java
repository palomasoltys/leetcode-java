public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4})); // 5
        System.out.println(maxProfit(new int[] {6,5,4,3,2,1})); // 0
    }

//    You are given an array prices where prices[i] is the price of a given stock on the ith day.
//    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    static int maxProfit(int[] prices) {
        //create a variable to store the result
        int maxProfit = 0;
        //create a buy (0) and sell (1) variables to be the pointers
        int buy = 0;
        int sell = 1;
        //loop while sell doesnt reach the end of the array
        while (sell <= prices.length - 1) {
            //if buy >= sell, buy = sell and increment sell by 1
            if(prices[buy] >= prices[sell]) {
                buy = sell;
            } else {
                // check to see if the difference between buy and sell is greater than result
                int profit = prices[sell] - prices[buy];
                // if yes update result with the difference
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
            sell++;
        }
        // return result outside the loop
        return maxProfit;

    }
}

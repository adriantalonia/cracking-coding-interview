package _004_interview_preparation._03_leetcode._grind75._04_best_time_to_buy_and_sell;

public class BestTimeToBuyAndSell {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Prices [7,1,5,3,6,4], out should be 5 and then was: " + maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {

        int profit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > buy) {
                profit = Math.max(profit, prices[i] - buy);
            } else {
                buy = prices[i];
            }


        }
        return profit;

    }
}

# Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104

# Intuition
The problem involves finding the maximum profit by buying and selling a stock, with the constraint that you must buy before selling. The key insight is to identify potential buying opportunities and update the maximum profit when a better selling opportunity is encountered.

# Approach
To solve the problem, we use a greedy approach. We iterate through the array of stock prices, keeping track of the minimum buy price and updating the maximum profit whenever a better selling opportunity is found. The algorithm ensures that we buy at the lowest point and sell at the highest point.

# Complexity
- Time complexity: O(n), where n is the length of the prices array. The algorithm iterates through the prices array once.
- Space complexity: O(1), as the algorithm uses a constant amount of space to store the profit and buy variables.

# Code
```java
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                profit = Math.max(profit, prices[i] - buy);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
}
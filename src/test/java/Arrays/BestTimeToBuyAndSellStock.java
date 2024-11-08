package Arrays;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
        int[] a = new int[]{7, 1, 5, 3, 6, 4};

        int minSoFar = a[0];
        int currentProf = 0;

        for (int i = 1; i < a.length; i++) {
            int profit = a[i] - minSoFar;
            if (profit > currentProf) {
                currentProf = profit;
            }
            minSoFar = Math.min(a[i], minSoFar);
        }

        System.out.print("Best Time to Buy and Sell Stock: " + currentProf);
    }

}

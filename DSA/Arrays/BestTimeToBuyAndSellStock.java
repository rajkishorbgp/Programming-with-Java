/*
 *                        Best Time to Buy & Sell Stock
 *  
 *    you are given an array price where prices[i] is the price of a given stock on the ith day. 
 *    you want to maximize your profit by choosing a single day to buy one stock and choosing a different
 *    day in the future to sell that stock . return the maximum profit you can achieve from this transaction.
 *    if you cannot achive any profit , return 0. 
 *            Prices = [7,1,5,3,6,4] 
 * 
 */

public class BestTimeToBuyAndSellStock {

    public static int profit(int price[]) {
        int buyPrice=Integer.MAX_VALUE;
        // int sellPrice=Integer.MIN_VALUE;
        int maxProfit=0;
        for(int i=0; i<price.length; i++){
            
            // sellPrice=Math.max(sellPrice , price[i]);
            if(buyPrice<price[i]){   // profit
               int profit= price[i]-buyPrice;  // today's profit
               maxProfit=Math.max(maxProfit , profit);
            }else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int price[] ={7,1,5,3,6,4};
        System.out.println("Profit " + profit(price));
    }
}

/*
 *   Output:
 *   Profit 5
 */

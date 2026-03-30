package week_3;
public class BestTimetoBuyandSellStock_121 {
	static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int buyPrice = prices[0];
		for(int i = 1; i < prices.length; i++) {
			int curr_Price = prices[i]-buyPrice;
			if (curr_Price > maxProfit) {
				maxProfit = curr_Price;
			}
			if (prices[i] < buyPrice) {
				buyPrice = prices[i];
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,17};
		int result = maxProfit(prices);
		System.out.println(result);
	}
}
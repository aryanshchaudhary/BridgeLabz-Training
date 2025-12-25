package level_1;

public class ProfitLoss {

	public static void main(String[] args) {
		double CP = 129;
		double SP = 191;
		if (CP<SP) {
			double Profit = SP-CP;
			double Profit_Percentage = Profit/CP*100;
			System.out.println("The Cost Price is INR " + CP + " and Selling Price is INR " + SP + 
					"\n" + "The Profit is INR " + Profit +
					" and the Profit Percentage is " + Profit_Percentage + "%");
		} else {
			double Loss = CP-SP;
			double Loss_Percentage = (Loss/CP)*100;
			System.out.println("The Cost Price is INR " + CP + " and Selling Price is INR " + SP + 
					"\n" + "The Loss is INR " + Loss +
					" and the Loss Percentage is " + Loss_Percentage + "%");
		}		
	}
}

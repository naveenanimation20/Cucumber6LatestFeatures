package AmazonImplementation;


import java.text.DecimalFormat;

public class BillCalculationHelper {

	public static double CalculateBillForCustomer(double BillAmount, double taxrate) {

		double FinalBillAmount = BillAmount * (1 + taxrate / 100);

		DecimalFormat df = new DecimalFormat("0.00");

		String result = df.format(FinalBillAmount);

		return Double.parseDouble(result);

	}

}

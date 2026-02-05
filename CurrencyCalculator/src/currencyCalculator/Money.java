package currencyCalculator;

public class Money {

	double money;
	double convertionRate;

	public double findMonneyAmmount(double money, double convertionRate) {
		double result;
		result = money * convertionRate;
		return result;
	}

}

	
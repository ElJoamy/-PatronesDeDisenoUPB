public class Tax
{
	protected double CalculateBaseTax(){
		return 0;
	}

	protected double AddTax(double tax){
		return tax;
	}

	public double GetTaxAmount(){
		double tax = CalculateBaseTax();
		var taxAmount = AddTax(tax);
		return new var(taxAmount);
	}
}
public class Person extends Tax{

	public double CalculateTax(){
		return 0;
	}

	public double AddTax(double tax){
		return tax;
	}

	@Override
	public double GetTaxAmmount(){
		double tax = CalculateTax();
		var taxAmount = AddTax(tax);
		return new var(taxAmount);
	}
}
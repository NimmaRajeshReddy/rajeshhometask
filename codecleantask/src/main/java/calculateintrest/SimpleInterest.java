package sample;

public class SimpleInterest
{
	private double ipamount;
	private double anualrateintrest;
	private double tmeinyrs;
	private double si;
	
	public SimpleInterest(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears)
	{
		this.ipamount = initialPrincipalAmount;
		this.anualrateintrest = annualRateOfInterest;
		this.tmeinyrs = timeInYears;
	}
	
	public void setValues(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears)
	{
		this.ipamount = initialPrincipalAmount;
		this.anualrateintrest = annualRateOfInterest;
		this.tmeinyrs = timeInYears;
	}
	
	public double calculateSimpleInterest()
	{
		si = (ipamount * tmeinyrs * anualrateintrest)/100;
		return si;
	}
}
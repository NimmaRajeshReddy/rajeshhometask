package sample;
import java.lang.Math;
public class CompoundInterest
{
	private double principle;
	private double anualrate;
	private double timeiny;
	private int cfrqperyear;
	private double ci;
	
	public CompoundInterest(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears, int compoundingFrequencyPerYear)
	{
		this.principle = initialPrincipalAmount;
		this.anualrate = annualRateOfInterest;
		this.timeiny = timeInYears;
		this.cfrqperyear = compoundingFrequencyPerYear;
	}
	
	public void setValues(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears , int compoundingFrequencyPerYear)
	{
		this.principle = initialPrincipalAmount;
		this.anualrate = annualRateOfInterest;
		this.timeiny = timeInYears;
		this.cfrqperyear = compoundingFrequencyPerYear;
	}
	
	public double calculateCompoundInterest()
	{
		ci = (principle * Math.pow(1 + anualrate / (cfrqperyear*100) , (timeiny * cfrqperyear))) - principle;
		return ci;
	}
}


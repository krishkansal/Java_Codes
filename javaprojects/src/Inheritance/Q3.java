package Inheritance;

abstract class Policy1
{
	String pNo;
public abstract double getBenefit();
public abstract String toString();


public Policy1(String pNo)
{
	System.out.println("Policy Constructor is called");
	this.pNo=pNo;
}

}

//child class
class LIC extends Policy1
{
	int investAmt;
	int rate=3;
public LIC(String pNo, int investAmt)
{
	super(pNo);	
	this.investAmt=investAmt;
}
public double getBenefit()
{
	return this.investAmt*rate;
}
public String toString()
{
return "Policy Number : "+super.pNo+ "  Benefit is "+getBenefit();	
}
	
	
}

class SIP extends Policy1
{
int investAmt;
int rate =5;

	public SIP(String pNo,int investAmt)
	{
		super(pNo);
		this.investAmt=investAmt	;
	}

	@Override
	public double getBenefit() 
	{
		
		return this.investAmt*rate;
	}

	@Override
	public String toString() 
	{

		return "Policy Number : "+super.pNo+ "  Benefit is "+getBenefit();	
	}
	
}

public class Q3 {

	public static void main(String[] args) {
		
		
		
		Policy1 objP1= new LIC("P101", 12000);

		Policy1 ObjP2=new SIP("P102", 12000);

		System.out.println(objP1.toString());
		System.out.println(ObjP2.toString());
	}

}

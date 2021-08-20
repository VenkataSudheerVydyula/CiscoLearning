package OopsCisco;

class Bank
{
	float getRateofInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	float getRateofInterest()
	{
		return 7.3f;
	}

}
class ICICI extends Bank
{
	float getRateofInterest()
	{
		return 8.4f;
	}

}
class AXIS extends Bank
{
	float getRateofInterest()
	{
		return 9.7f;
	}

}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SBI();
		System.out.println("SBI rate of interest:"+b.getRateofInterest());
		
		b=new ICICI();
		System.out.println("ICICI rate of interest:"+b.getRateofInterest());

		b=new AXIS();
		System.out.println("AXIS rate of interest:"+b.getRateofInterest());


	}

}

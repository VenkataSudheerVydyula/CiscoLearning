package Ciscopackage1;

public class ClassM {
	private int i=20;
	
	
	protected float f1=3.14F;
	long l1=1000;
	public void methodPublic()
	{
		
		methodDefault();
		System.out.println(i);
		methodProtected();
		methodPrivate();
		
	}
	 void methodDefault()
	{
		 System.out.println("method default");
		
	}
	 protected void methodProtected()
		{
			System.out.println("method protected");
		}
	 private void methodPrivate()
		{
		 System.out.println("method private");
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

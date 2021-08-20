package AssignmentOOPS;

public class Methods {
	public int add(int m,int n)
	{
		int c=m+n;
		return c;
	}

	public double add(int r)
	{
		double c=3.14*r*r;
		return c;
	}
	
	public int rectangle(int l,int b)
	{
		int c=l*b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m=new Methods();
	System.out.println(m.add(3, 4));	
	System.out.println(m.add(4));
		System.out.println(m.rectangle(4, 3));

	}

}

package AssignmentOOPS;

public class Constructors {
	int x;
	int y;
	double z;
	
	//CONSTRUCTORS
	Constructors(){
		System.out.println("Default constructor");
		
	}

	Constructors( int a)
	{
		this.x=a*a;
	}
	public Constructors(int l,int m) {
		
		this.y=l*m;
	}
	public Constructors(double r)
	{
		this.z=3.14*r*r;
	}
	//METHODS
	
	public void square()
	{
		System.out.println("Area of the square="+x);
	}
	public void rectangle()
	{
		System.out.println("Area of the rectangle="+y);
	}
	
	public void circle()
	{
		System.out.println("Area of the circle="+z);
	}
	
	public void Overloading(int p,int q)
	{
		System.out.println("Area of the rhombus="+p*q/2);
		System.out.println("Area of the triangle="+(0.5*p*q));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors c=new Constructors(5);
		Constructors c1=new Constructors(5,6);
		Constructors c2=new Constructors(5.2);
		Constructors c3=new Constructors();
		c3.Overloading(1, 2);
		c3.square();
		c3.rectangle();
		c3.circle();
		

	}

}

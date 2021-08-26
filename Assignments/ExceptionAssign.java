package Assignments;


import java.util.Scanner;

 class MyCalculator {
	
	public long power(int n,int p) throws Exception  {
		if(n < 0 ||p < 0)
		{
			throw new Exception("n or p should not be negative");
		}
		else if(n == 0 && p == 0) {
			throw new Exception("n and p should not be zero ");
		}else {
			return (long) Math.pow(n,p);
		}
	}
	public static void main(String []args) {
		
	}


}

 

public class ExceptionAssign {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter n and p values ");
		
		 MyCalculator m=new MyCalculator();
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			System.out.println(m.power(x,y));
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}

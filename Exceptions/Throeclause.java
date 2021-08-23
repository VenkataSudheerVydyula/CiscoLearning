package Exceptions;
import java.io.IOException;
import java.util.Scanner;

public class Throeclause {
	
	static int add(int n1,int n2) throws IOException
	{
		if(n1>900)
		{
			throw new ArithmeticException("Num 1 is greater than 900");
		}
		else {
			throw new IOException("IO exception");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num-1");
		int num1=sc.nextInt();
		System.out.println("enter num-2");
		int num2=sc.nextInt();
		
		try {
			res=add(num1,num2);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Result is:"+res);

	}

}

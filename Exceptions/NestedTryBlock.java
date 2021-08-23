package Exceptions;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkException();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally outside the method");
		}

	}
	public static void checkException() {
		try {
			int res=3/0;
		}finally {
			System.out.println("Finally inside the method");
		}
	}

}

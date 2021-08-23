package Exceptions;

public class AssignmentExceptions {
	static void validate(int sal) throws InvalidSalaryException{
		if(sal<2000) {
			throw new InvalidSalaryException("you need to work hard");
		}else if(sal>2100 && sal<5000){
			throw new InvalidSalaryException("your salary is somehow good");
		}else if(sal>5100 && sal<9000) {
            System.out.println("salary is very good");
		}else {
			System.out.println("great effort");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	validate(2000);
        }catch(Exception e) {
        	System.out.println("Exception occured:"+e.getMessage());
        }
        System.out.println("rest of the code");
	}

}
class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
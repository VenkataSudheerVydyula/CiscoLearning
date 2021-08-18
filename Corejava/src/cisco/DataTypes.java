package cisco;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char gender='M';
//		int age=22;
//		boolean v=true;
//		
//    System.out.println("gender is"+gender);
//    System.out.println("age is"+age);
		//TYPE CAST BETWEEN INT AND LONG
		int i=100;
		long l=i;  //automatic type conversion
		System.out.println("long value"+l);
		int o=(int) l;  //explicit type casting
		System.out.println("int value"+o);
//		
	char t=(char) i;
	System.out.println("char value"+t);
	
	
//		TYPE CAST BETWEEN DOUBLE AND FLOAT
	double d=19656594949.165465464;
	float r=(float) d; //explicit type casting
	System.out.println("float value"+" " +r);
	System.out.println("double value"+d);
	
  //TYPE CAST BETWEEN FROM DOUBLE ---->LONG---->INT in series
	double d2=100.04;
	long l2=(long)d2; //explicit typecasting required
	int i2=(int) l2;//explicit typecasting required
	System.out.println("double value"+d2);
	System.out.println("long value"+l2);
	System.out.println("Int value"+i2);
	//TYPE CAST BETWEEN LONG AND FLOAT
	float f=l;
	System.out.println("float value"+f);
	
	//TYPE CAST BETWEEN BYTE INT AND DOUBLE
	byte b;
	int ii=257;
	double dd=323.12;
	System.out.println("conversion of int to byte");
	b=(byte) ii;
	System.out.println("ii = "+ii +"b="+b);
	
	System.out.println("conversion of double to byte");
	b=(byte) dd;
	System.out.println("dd = "+dd +"b="+b);
	
	
	
	
	
	}

}

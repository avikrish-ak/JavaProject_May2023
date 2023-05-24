package day08;

public class Program1 {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		int c=10;
		
		
		//+ - * /(Q) %(R)
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/3);
		System.out.println(a%3);
		
		// > < >= <= == !=

		System.out.println(a>b);//true false
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("Logical");
		//&&-AND ||-OR !-NOT
		
		
		boolean x=true;
		boolean y=false;
		boolean  z=true;
		
		System.out.println(!x);
		System.out.println(!y);
		System.out.println(x&&z);//true
		System.out.println(x&&y);//false
		
		System.out.println(x||z);//true
		System.out.println(x||y);//true
		
		
		
	}

}

package day06;

public class Program1 {

	public static void main(String[] args) {
		add(10,20);
		add(1,2,3);
		add(1.2,1.4);

	}

	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	
	
}

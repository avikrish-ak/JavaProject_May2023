package day06.packageB;

import day06.packageA.Program1;

public class Program3 extends Program1{
	
	public static void main(String[] args) {
		Program1 x= new Program1();
		x.add(10,20);
		//x.div(10, 2);// default methods
		//x.mul(3,20);// protected non-static method
		//x.sub(10,20); Private Method
		
		Program3 y = new Program3();
		y.mul(10, 20);
		y.add(10,20);
		
	}


}

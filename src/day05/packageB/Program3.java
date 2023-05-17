package day05.packageB;

import day05.packageA.Program1;

public class Program3 extends Program1 {
	
	public static void main(String[] args) {

		add(10,20);//public 
		//sub(30,10);//private
		mul(2,3);//protected
		//div(10,2);//default
	}

}

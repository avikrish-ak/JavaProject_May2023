package day09;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find even or odd number :- ");
		int a=scan.nextInt();
		scan.close();
		if(a%2==0)
		{
			System.out.println(" even number ");
		}
		else
		{
			System.out.println(" odd number ");
		}

	}

}

package javapractice;

import java.util.Scanner;

public class GreatestOfThreeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  number");
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a  is greater  number");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater number");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater number");	
		}

	}

}

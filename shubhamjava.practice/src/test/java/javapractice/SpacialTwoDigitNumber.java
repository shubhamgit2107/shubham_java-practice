package javapractice;

import java.util.Scanner;

public class SpacialTwoDigitNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the  number");
		int n =s.nextInt();
		if(n>9 && n<100)
		{
			int f =n/10;
			int l=n%10;
			int a=f+l;
			int m=f*l;
			if(n==(a+m))
			{
				System.out.println("two digit special number" );
			
			
		}
			else
			{
				System.out.println("not a two digit special number");
			}
		}
		else
		{
			System.out.println("number is not 2digit number");
		}

	}

}

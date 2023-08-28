package javapractice2;

import java.util.Scanner;

public class SpeciltwodigitNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println( "enter the number");
		int n=s.nextInt();
		if(n>9 && n<100)
		{
		int f=n/10;
		int l=n%10;
		int a=l+f;
		int m=l*f;
		if(n==(a+m))
		{
			System.out.println("number is twodigit special number");
			
		}
		else
		{
			System.out.println("number is not twodigit specialnumber");
		}
		}
		else
		{
			System.out.println( "number is not two digit number");
		}

	}

}

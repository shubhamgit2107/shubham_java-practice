package javapractice2;

import java.util.Scanner;

public class Palindromnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println( "enter the number");
		int n=s.nextInt();
		int temp=n;
		int rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println( " numberis palindron ");
		}
		else
		{
			System.out.println( "number is not palindron");
		}
	

	}

}

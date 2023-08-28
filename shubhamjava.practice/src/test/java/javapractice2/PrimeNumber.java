package javapractice2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println( " enter the  value ");
		int n=s.nextInt();
		int temp=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(n+ " not the prime number");
		}
		else
		{
			System.out.println(n+ " is the prime number ");
		}

	}

}

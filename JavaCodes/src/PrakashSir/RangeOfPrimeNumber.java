package PrakashSir;

import java.util.Scanner;

public class RangeOfPrimeNumber {

	public static void main(String[] args)
	{
	int min=0;
	int max=0;
	int flag=0;
	System.out.println("enter minimum value");
	Scanner sc=new Scanner(System.in);
	min=sc.nextInt();
	System.out.println("enter maximum value");
	max=sc.nextInt();
	for (int n = min; n <=max; n++) 
	{
	for (int i = 2; i <n; i++) 
	{
	if(n%i==0)
	{
		flag=1;
		break;
	}
	} 	
	
	if(flag==0)
	{
		System.out.println(n+" ");
	}
	flag=0;

	}

}
}

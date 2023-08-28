package PrakashSir;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Amstrom {

	public static void main(String[] args) {

System.out.println("enter the number");
Scanner sc= new Scanner(System.in);
int x,x1,d,sum=0;
x=sc.nextInt();
x1=x;
while(x>0)
{
	d=x%10;
	sum=sum+(d*d*d);
	x=x/10;
}
	if(x1==sum)
	{
		System.out.println("number is amstrom");
	}
	else
	{
		System.out.println("number is not amstrong");
	}
}
	}



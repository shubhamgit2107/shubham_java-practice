package PrakashSir;

import java.util.Scanner;

public class Practice124456 {
public static void main(String[] args)
{
System.out.println("enter the number"); 
Scanner sc=new Scanner(System.in);


int n=sc.nextInt();
int temp=n;
int rev=0,rem;
while(temp!=0)
{
	rem=temp%10;
	rev=rev*10+rem;
	temp=temp/10;
}
if(rev==n)
{
	System.out.println("number is palindrom");
}
else
{
	System.out.println("number is not palindrom");
}


}
}


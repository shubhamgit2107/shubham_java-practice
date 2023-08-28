package Assingment;

import java.util.Scanner;

public class sumOfNumberInArrayReqired {

	public static void main(String[] args) {
		for(;;)
		{
		int []a= {23,4,3,4,8};
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the key ==>");
	int n = sc.nextInt();
	for (int i = 0; i < a.length; i++)
	{
	if(n==1)
	{
		System.out.println(a[0]);
		break;
	}
	else if(n==2)
	{
		System.out.println(a[0]+a[1]);
		break;
	}
	else if(n==3)
	{
		System.out.println(a[0]+a[1]+a[2]);
		break;
	}
	}
	}

	}

}

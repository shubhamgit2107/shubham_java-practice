package javapractice;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int a =s.nextInt();
		if(a%2==0)
		{
			System.out.println(" number is even  " +a );	
			
		}
		else
		{
			System.out.println(" number is odd  "+a);
		}

	}

}

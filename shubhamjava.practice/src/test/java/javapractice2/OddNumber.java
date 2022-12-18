package javapractice2;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		
		for(int i=1;i<=a;i=i+2)
		{
			System.out.println(i);
		}

	}

}

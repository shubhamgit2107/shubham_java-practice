package javapractice;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner s  =new Scanner(System.in);
		System.out.println("enter the number");
		int a =s.nextInt();
		for(int i=0; i<=a;i=i+2)
		{
			System.out.println(i+ "   ");
		}

	}

}

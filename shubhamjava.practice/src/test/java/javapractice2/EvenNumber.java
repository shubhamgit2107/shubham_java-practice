package javapractice2;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int n =s.nextInt();
		
		for(int i=0;i<=n;i=i+2)
		{
			System.out.println(i+ " "); 
		}

	}

}

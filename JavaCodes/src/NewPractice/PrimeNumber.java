package NewPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int flag=0;
		int min=0;
		int max=0;
		
		System.out.println("enter min value");
		Scanner sc=new Scanner(System.in);
		 min = sc.nextInt();
		System.out.println("enter maximum value");
		 max = sc.nextInt();
		
		for (int n= min; n <=max; n++) {
			
		
		for (int i = 2; i <n; i++) 
		{
		if(n%i==0) {
			flag=1;
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

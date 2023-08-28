package Assingment;

import java.util.Scanner;

public class InterView1 {

	
		public static void main(String[] args) {
			System.out.println("enter the numnber");
			Scanner sc= new Scanner(System.in);
			int n = sc.nextInt();
			int firstsum=sumOFDigits(n);
			while(!(firstsum>=-9 && firstsum<=9))
			{
				firstsum=sumOFDigits(firstsum);
			}
			System.out.println(firstsum);
		}

		private static int sumOFDigits(int n) 
		{
			int sum=0;
			do {
			int r=n%10;
			sum=sum+r;
			n=n/10;
			}
			while(n!=0);
			return sum;
		}

}

		

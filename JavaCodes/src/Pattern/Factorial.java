package Pattern;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		for(;;)
		{
		
		
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
int n = sc.nextInt();

int fact=1;
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(" factorialof given number is => " +fact);
		}
		
	}

}

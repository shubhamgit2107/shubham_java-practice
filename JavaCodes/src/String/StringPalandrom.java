package String;

import java.util.Scanner;

public class StringPalandrom {
	public static void main(String[] args) {
		for(;;)
		{
			
		
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		//String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("string is palandrome "+rev);
		}
		else
		{
			System.out.println("string is not palandrome "+rev);
		}
	}
}
}



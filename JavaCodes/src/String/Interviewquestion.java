package String;

import java.util.LinkedHashSet;

public class Interviewquestion {

	public static void main(String[] args) {
	String s= "a3b4c2d5";
	char[] a = s.toCharArray();

	for (int i = 0; i < a.length; i++)
	{

	for (Character ch : a) 
	{
		int count=0;	
		for (int j = 0; j < a.length; j++)
		{
		if(ch==a[i])
		{
			count++;
		}
	
		}
		System.out.print(ch);
	}
	}
	}
}
	
		
	


	



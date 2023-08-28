package NewPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Practice1234 {
	public static void main(String[] args) 
	{

int[] a={2,4,5,6,7,8,8,8,8};

int max=0;
int element=0;
for (int i = 0; i < a.length; i++) 
{
int count=0;
for (int j = 0; j < a.length; j++)
{
	if(a[i]==a[j])
	{
		count++;
	}
	if(count>max)
	{
		max=count;
		element=a[i];
	}
	
	
}

}

System.out.println(element+"is  repeating"+max+" times"); 
}

}
		


	



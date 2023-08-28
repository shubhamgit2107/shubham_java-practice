package Assingment;

import java.util.LinkedHashSet;

public class RemoveDuplicateLetters {

	public static void main(String[] args)
	{
		String s="My name is risav  it contains ri amd sav";
		char[]a= s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++)
		{
			set.add(a[i]);
		}
		for (Character integer : set)
		{
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			
		if(integer==a[i])
		{
			count++;
		}
		}
if(count>0)
{
	System.out.print(integer+" ");
}
	}

}
}

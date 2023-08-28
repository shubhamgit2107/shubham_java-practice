package String;

import java.util.LinkedHashSet;

public class OccuranceOfLetter {

	public static void main(String[] args) {
		 
		String str="i am bangalore";
		 
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++)
		{	
		  set.add(str.charAt(i));
		}
		
for (Character s : set) 
{
      int count=0;
	for (int i = 0; i<str.length(); i++)
	{
		if(s.equals(str.charAt(i)))
		{
			count++;	
		}
		
	}

	if(count>=1)
	{
	System.out.println(s+" is repeating "+count+" times");	
	}
}
	}
}



package String;

import java.util.LinkedHashSet;

public class OccurenceOfCharacter {
public static void main(String[] args) {
	int count=0;

	for(;;)
	{
		String s="Testyantra";
				LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
			for(Character ch:set)
			{
				
			for(int i=0;i<s.length();i++)
			{
			
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ch+"is repeating"+count+ "times");
			}
			}
				
			
			
		}
}
	
}


package String;

import java.util.LinkedHashSet;

public class ToPrintpositionWithoutDuplicates {
public static void main(String[] args) {
	for(;;)
	{
	String s="testYantra";
	LinkedHashSet<Character> set=new LinkedHashSet<>();
	for(int i= 0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(Character ch:set)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		if(count>1)
		{
			System.out.println(ch+"is repeating"+count+"");
			break;
		}
		
	}
}
}
}
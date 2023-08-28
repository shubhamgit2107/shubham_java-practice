package PrakashSir;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args)
	{
		String  s="welcome to testyantra welcome to office";
		String[] st = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i = 0; i < st.length; i++)
		{
		set.add(st[i]);	
		}
		System.out.println(set);

	}

}

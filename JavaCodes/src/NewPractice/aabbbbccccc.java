package NewPractice;

import java.util.LinkedHashSet;

public class aabbbbccccc {

	public static void main(String[] args) {
		String s="aabbbccccddddd";
		char[] st = s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < st.length; i++) 
		{
		set.add(st[i]);	
		}
		for (Character cha : set)
		{
		int count=0;
		for (int i = 0; i < st.length; i++)
		{
		if(cha==st[i])
		{
			count++;
		}
		}
		System.out.print(cha+""+count);
		}

	}

}

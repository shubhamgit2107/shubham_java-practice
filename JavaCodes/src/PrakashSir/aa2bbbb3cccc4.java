package PrakashSir;

import java.util.LinkedHashSet;

public class aa2bbbb3cccc4 {

	public static void main(String[] args) {
		String s="aabbbcccc";
		char[] st = s.toCharArray();
		LinkedHashSet<Character> set= new LinkedHashSet<>();
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

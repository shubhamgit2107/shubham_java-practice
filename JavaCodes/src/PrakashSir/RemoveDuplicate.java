package PrakashSir;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s= "Tecnology";
		char[] st = s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet();
		for (int i = 0; i < st.length; i++) 
		{
			set.add(st[i]);
		}
		System.out.println(set);

	}

}

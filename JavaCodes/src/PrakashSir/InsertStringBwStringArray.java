package PrakashSir;

import java.util.ArrayList;

public class InsertStringBwStringArray {

	public static void main(String[] args) {
		String [] s= {"kiran","is","good"};
		ArrayList<String> list= new  ArrayList<>();
	
		for (int i = 0; i < s.length; i++)
		{
			list.add(s[i]);
		}
		System.out.println(list);
		int mi  =list.size()/2;
		list.add(mi, "nice");
		System.out.println(list);
		
	

	}

}

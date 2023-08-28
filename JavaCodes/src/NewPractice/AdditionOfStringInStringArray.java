package NewPractice;

import java.util.ArrayList;

public class AdditionOfStringInStringArray {

	public static void main(String[] args) {
		String[] s={"good","is","always","bad"};
		ArrayList<String>list= new ArrayList<String>();
		for (int i = 0; i < s.length; i++) 
		{
		list.add(s[i]);
		}
		System.out.println(list); 
		int mid = list.size()/2;
		list.add(mid, "true");
		System.out.println(list);

	}

}

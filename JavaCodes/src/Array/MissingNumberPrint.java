package Array;

import java.util.LinkedHashSet;

public class MissingNumberPrint {

	public static void main(String[] args) {
		int []a= {5,7,8,9};
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for (int i = 0; i <10; i++) 
		{
			set.add(i);
		}
		for (int i = 0; i < a.length; i++) 
		{
			set.remove(a[i]);
		}
System.out.println(set);
	}

}

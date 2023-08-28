package Array;

import java.util.LinkedHashSet;

public class OccurenceOfEachDigitInArray {

	public static void main(String[] args) {
		int[] a= {2,6,8,8,2,3,1};
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
		set.add(a[i]);
		}
		for(Integer n: set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(n==a[i])
				{
					count++;
				}
			}
		if(count>1) {
		
System.out.println(n+" is reapeating" +count+" time");
	}
		}
	}

}

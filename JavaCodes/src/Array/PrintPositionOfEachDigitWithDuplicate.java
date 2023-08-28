package Array;

import java.util.LinkedHashSet;

public class PrintPositionOfEachDigitWithDuplicate {

	public static void main(String[] args) {
		int [] a= {2,4,6,6,8,1};
	
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
		set.add(a[i]);
		}
		for(Integer n: set)
		{
for(int i=0;i<a.length;i++)
{
	int count=0;
	if(n==a[i])
	{
		count++;
	}
	
	if(count<1)
	{
		System.out.println(n+"is in"+ +(i+1)+" position");

	}
}
		}
	}
}

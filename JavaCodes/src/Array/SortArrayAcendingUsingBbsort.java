package Array;

import java.util.PriorityQueue;

public class SortArrayAcendingUsingBbsort {

	public static void main(String[] args) {
		int [] a= {5,3,7,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])
				
			{
				int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
			}
			}
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		
	}
}

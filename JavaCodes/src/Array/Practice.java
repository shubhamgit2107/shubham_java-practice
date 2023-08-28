package Array;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int []a= {4,6,8,2,1,6,56,32};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for (int i = 0; i < n; i++)
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

package Array;


import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		int []a= {2,4,2,5,7,5};
	LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer inti:set)
		{
			System.out.println(inti+"  " );
		}
	}

}

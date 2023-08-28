package NewPractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortwithoutUsingBubblesort {

	public static void main(String[] args)
	{		
		
		
		
	ArrayList<Integer> list=new ArrayList<>();
	list.add(4);
	list.add(6);
	list.add(9);
	list.add(10);
	list.add(1);
	list.add(3);
	Collections.sort(list);
	//Collections.reverse(list);
	System.out.println(list);
	}

}

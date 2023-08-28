import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;



public class Practice123 {

	public static void main(String[] args) {
		
		String[] s= {"my","name","is","shubham","kumar"};
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<=s.length-1;i++)
		{
			list.add(s[i]);
		}
		int mid = list.size()/2;
		list.add(mid, "nice also");
		System.out.println(list); 
	
		}
	}



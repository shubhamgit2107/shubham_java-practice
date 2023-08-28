package String;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordInString {

	public static void main(String[] args) {
	String st="i am from bangalore";
	String str = st.toLowerCase();
	String[] s = str.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<>();
	for(int i=0;i<s.length;i++)
	{
		set.add(s[i]);
	}
		for(String stri :set)
		{
			int count=0;
			for(int i=0;i<s.length;i++)
			if(stri.equals(s[i]))
			{
				count++;
				System.out.println(stri+" is in position "+(i+1));
				break;
			}
		}
		
		
			
		}
		
	}

	



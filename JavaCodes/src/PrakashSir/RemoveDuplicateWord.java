package PrakashSir;

public class RemoveDuplicateWord {

	public static void main(String[] args) 
	{
	String s=" shubham  shubham swapnil";
	String[] st = s.split(" ");
		for (int i = 0; i < st.length-1; i++) 
	{
	for (int j = i+1; j < st.length; j++) 
	{
		if(st[i].equals(st[j]))
		{
			st[i]=" ";
		}
	} 	
	}
	for (int i = 0; i < st.length; i++)
	{
	System.out.println(st[i]);	
	} 

	}

}

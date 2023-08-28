package PrakashSir;

public class ReverseFirstWord {

	public static void main(String[] args) 
	{
	String s="Zaffer is good boy";
	String[] st = s.split(" ");
	for (int i = 0; i < st.length; i++) 
	{
	String rev="";
	if(i==0)
	{
		for (int j = 0; j < st.length; j++)
		{
		rev=st[i].charAt(i)+rev;	
		}
		st[i]=rev;
	}
	System.out.print(st[i]+" ");
	}

	}

}

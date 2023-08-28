package Assingment;

public class ReverseTheStringAndRemoveSpace {

	public static void main(String[] args) {
		String s=" my name is shubham";
	String a = s.replace(" ", "");
	char[] b = a.toCharArray();
	int count=0;
	for (int i = b.length-1; i >=0; i--) 
	{
	if(count<2)	
	{
		System.out.print(b[i]+  " ");
		count++;
	}
	else
	{
		System.out.print(b[i]);
	}
	}
	}

}

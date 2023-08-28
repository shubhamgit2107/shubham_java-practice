package PrakashSir;

public class FirstMaximum {

	public static void main(String[] args) {
		int [] a= {2,5,3,-8,2};
		int fmax=0;
		for (int i = 0; i < a.length; i++)
		{
		if(fmax<a[i])
		{
		fmax=a[i];	
		}

	}
		
System.out.println(fmax);
}
}

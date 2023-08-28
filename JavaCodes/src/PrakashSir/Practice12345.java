package PrakashSir;

public class Practice12345 {

	public static void main(String[] args) {
	
	int []a= {1,4,3,2,5,6,7};
	int fmin=a[0];
	int smin=a[1];
	for (int i = 0; i < a.length; i++) 
	{
	if(a[i]<fmin)
	{
		if(a[i]!=fmin)
		{
			smin=fmin;
		}
		fmin=a[i];
	}
	else if(smin==fmin || a[i]<smin)
	{
		smin=a[i];
	}
	}
	System.out.println(fmin+" ");	
	System.out.println(smin+" ");







	}	
}

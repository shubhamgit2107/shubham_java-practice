package Array;

public class AdditionOf2Arrays {

	public static void main(String[] args)
	{
		int sum=0;
		int[] a= {2,4,5,1,6};
		int[] b= {3,2,2,1};
		int length=a.length;
		if(a.length>b.length)
		{
			length=a.length;
		}
for(int i=0;i<length;i++)
{
	try
	{
		System.out.print(a[i]+b[i]);
	}
	catch(Exception e)
	{
		if(a.length>b.length)
		{
			System.out.print(a[i]);
		}
		else
		{
			System.out.println(b[i]);
		}
	}
}
	}

}

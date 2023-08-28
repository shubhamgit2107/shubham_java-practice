package Array;

public class Add0fNumberIs15 {

	public static void main(String[] args) 
	{
	int[] a= {2,4,7,8,11,13};
	for (int i = 0; i < a.length; i++)
	{
		for (int j = 0; j < a.length; j++) 
		{
		if(a[i]+a[j]==15)
		{
			System.out.println("the values are "+a[i]+"  "+a[j]);
		}
		}
	}

	}

}

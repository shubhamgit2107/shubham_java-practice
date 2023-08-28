package NewPractice;

public class AppendTheSeries {

	public static void main(String[] args)
	{
int[] a= {3,5,1,3,7,4,1};
int [] b= new int[a.length-1];
int m=0;
int n=a[a.length-1];
for (int i = 0; i < a.length; i++)
{
	if(a[i]==1)
	{
		b[m]=a[i];
		m++;
	}
	else
	{
		b[n]=a[i];
		n++;
	}
	
}
for (int i = 0; i < b.length; i++) 
{
System.out.print(b[i]+" ");	
}



	}

}

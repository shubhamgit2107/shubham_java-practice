package NewPractice;

public class FirstMaximumsecondMaximumWithoutBublesort {

	public static void main(String[] args) {
		int []a= {2,4,2,1,7,6,5};
		int fmax=0;
		int smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				if(a[i]!=fmax)
				{
				smax=fmax;	
				}
				fmax=a[i];
			}
			if(smax==fmax ||a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);

	}

}

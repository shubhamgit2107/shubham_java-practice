package Array;

public class FindFirstMaximumSecondMaximumWithoutUsingBbubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,2,0,0,5};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=fmax)
			{
				if(a[i]!=fmax)
				{
					smax=fmax;
				}
				fmax=a[i];
			}
			else if(fmax==smax|| a[i]>smax)
			{
				smax=a[i];
			}
			
		}
		System.out.println(fmax);
		System.out.println(smax);
			}

	



	}



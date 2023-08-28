package Array;

public class FindTheFirstMaximumWithoutUsingBbsort {

	public static void main(String[] args) {
		int[] a= {3,2,5,1};
		int fmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				fmax=a[i];
			}
		}
		System.out.println(fmax);
			}

		

	}



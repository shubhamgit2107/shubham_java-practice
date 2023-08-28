package Array;

public class FindFirsstMinimumNumberInArrayWithoutBubleSort {

	public static void main(String[] args) {
		
		int[] a= {3,2,5,1};
int fmin=a[0];
for(int i=0;i<a.length;i++)
{
	if(fmin>a[i])
	{
		fmin=a[i];
	}
}
System.out.println(fmin);
	}

}

package Array;

public class SumOfFirstThreeMaximumNumber {

	public static void main(String[] args) {
		int [] a= {56,89,12,4,87};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])
				
			{
				int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
			}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[a.length-1];
		}
		System.out.println("the sum of  three maximum number in array ==>"  +sum);
	}

	




	}



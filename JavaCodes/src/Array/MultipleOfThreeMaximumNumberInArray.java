package Array;

public class MultipleOfThreeMaximumNumberInArray {

	public static void main(String[] args) {
		int [] a= {5,1,7,4,6};
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
		int mul=1;
		for(int i=a.length-1;i>1;i--)
		{
			mul=mul*a[i];
		}
		System.out.println("the multiple of  three maximum number in array ==>"  +mul);
	}

	

	}



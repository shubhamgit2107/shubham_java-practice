package Array;

public class SecondMaximumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {56,89,12,4};
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
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println("second maximum number"+a[a.length-2]);
	}

	}



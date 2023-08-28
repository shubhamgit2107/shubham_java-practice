package Array;

public class FirstMinimumNumberInArray {

	public static void main(String[] args) {
		int [] a= {76,32,98,4};
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
		System.out.println("first minimum number"+a[0]);
	}



	}



package PrakashSir;

public class RemoveDuplicateInArrayWithoutCollection {

	public static void main(String[] args) {
		int [] a= {2,4,3,1,5,67,1,2,3};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
			if(a[i]==a[j])
			{
				a[i]=-1;
			}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=-1)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}

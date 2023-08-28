package NewPractice;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int[] a= {3,4,5,1,4};
		int [] b= {1,4,2,8,1};
		int length=a.length;
		if(a.length>b.length)
		{
			length=a.length;
		}
		for (int i = 0; i <length; i++)
		{
			try {
				System.out.println(a[i]+b[i]);
			}
			catch (Exception e) {
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.println(b[i]);
				}
							
			}
			
		}

	}

}

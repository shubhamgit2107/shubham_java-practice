package Pattern;



public class MultipleNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;

for (int i = 0;i<=n; i++) 
{
	for (int j = 0; j <=n-i; j++)
	{
		System.out.print(" ");
	}
	
	for (int j = 0; j <= i; j++) 
	{
	System.out.print( i+" ");	
	}

System.out.println();
	}
	}

}

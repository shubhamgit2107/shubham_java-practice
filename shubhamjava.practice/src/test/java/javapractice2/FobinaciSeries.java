package javapractice2;

public class FobinaciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a+" " +b);
		for(int i=1;i<=10;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c+ "  ");
		}
		

	}

}

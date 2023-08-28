package String;

public class Swap1stAndLastWords {

	public static void main(String[] args) {
		String s="i am from bangalore";
		String[] a = s.split(" ");
		
		String temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ "");
		}

				
	}

}

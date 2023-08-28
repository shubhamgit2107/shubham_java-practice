package String;

public class ReverseTheGivenSentance {

	public static void main(String[] args) {
		String s="i m from bangalore";
	String[] a = s.split("");
	for(int i =a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+ "");
	}

	}

}

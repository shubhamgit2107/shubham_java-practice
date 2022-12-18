package javapractice2;

public class ReverseString {

	public static void main(String[] args) {
		String name="shubhamkumar";
				int l=name.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
		{
			rev=rev +name.charAt(i);
		}
		System.out.println("reverseof "+name+ " is "+rev);

	}

}

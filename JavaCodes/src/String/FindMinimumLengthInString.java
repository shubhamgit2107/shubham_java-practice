package String;

public class FindMinimumLengthInString {

	public static void main(String[] args) {
		
		
		String[] s= {"s","abcd","a","abc","ab"};
		String min_length=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(min_length.length()>s[i].length())
			{
				min_length=s[i];
		
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(min_length.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
		
	}

}

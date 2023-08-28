
public class Practice12 {

	public static void main(String[] args)
	{
	String s="shubhamkumar";
	char[] st = s.toCharArray();
	int vowel=0;
	int consonent=0;
	
		
	for (int i = 0; i < st.length; i++) {
		
	
	if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||s.charAt(i)=='e')
	{
		vowel++;
		System.out.println(st[i]+" this is vowel");
	}
	else
	{
		consonent++;
		System.out.println(st[i]+" this is consonent");
	}

	}

	}
}

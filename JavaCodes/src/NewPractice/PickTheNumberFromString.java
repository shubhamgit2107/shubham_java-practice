package NewPractice;

public class PickTheNumberFromString {

	public static void main(String[] args)
	{
		String s="qwe23mj45";
		int num=0;
		for(int i=0;i<s.length();i++ )
		{
			if(s.charAt(i)>='0' &&  s.charAt(i)<='9')
			{
			int n=s.charAt(i)-48;
			num=num*10+n;
		}
	
		}
		System.out.println(num);
	}

}

package String;

import java.util.LinkedHashSet;

public class OccurenceOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st=" bangalore";
		String str = st.toLowerCase();
		char[] s = str.toCharArray();
		int vowel=0;
		int consonent=0;
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]=='a' || s[i]=='e' || s[i]=='i' ||  s[i]=='o' || s[i]=='u')
			{
				vowel++;
				System.out.print(s[i]);
			}
			else
			{
				consonent++;
			}
		}
		System.out.println("no of vowelin string is ==>"+vowel);
		System.out.println("no ofconsonent ==>"+consonent);
	}
}

package String;

public class FindMaximamLengthInDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s= {"12","1","53","4","765392"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])<0)//< --decending and >-- acending
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
System.out.println(s[i]);
	}

}

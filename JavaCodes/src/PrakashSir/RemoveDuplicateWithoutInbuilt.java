package PrakashSir;

public class RemoveDuplicateWithoutInbuilt {

	public static void main(String[] args) {
		String s="Tecnology";
		char[] st = s.toCharArray();
		for (int i = 0; i < st.length-1; i++)
		{
			for (int j = i+1; j < st.length; j++) 
			{
			if(st[i]==st[j])
			{
				st[i]=0;
			}
			}
			
		}
		for (int i = 0; i < st.length; i++)
		{
		System.out.print(st[i]+" ");
			
		}

	}

}

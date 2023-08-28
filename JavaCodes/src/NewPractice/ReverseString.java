package NewPractice;

public class ReverseString {

	public static void main(String[] args) {
		String s="shubham";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		
		//char[] st = s.toCharArray();
		//for(int i=st.length-1;i>=0;i--)
		//{
		//	System.out.print(st[i]);
	//	}
		
	//	StringBuilder builder=new  StringBuilder("shubham");
		
		
		//System.out.println(builder.reverse());
		}

	}



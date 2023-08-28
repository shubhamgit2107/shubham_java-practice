package PrakashSir;

public class InterchangeWord {

	public static void main(String[] args) {
//		String s="today is friday";
//		String[] st = s.split(" ");
//		String temp=st[0];
//		st[0]=st[st.length-1];
//		st[st.length-1]=temp;
//		for (int i = 0; i < st.length; i++) {
//			
//		System.out.print(st[i]+" ");
//		}

		String []s="today is monday friday".split(" ");
		
		for(int i=s.length-1; i>=0; i--) {
			System.out.print(s[i]+" ");
		}
	}

}

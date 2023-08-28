package String;



public class RemoveSpacesBetweenTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String s= "I am from bangalore";
	//	System.out.println(s.replace(" ", ""));
		String s="i m from bangalore";
		String[] a=s.split(" ");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]);
		}

	}

}

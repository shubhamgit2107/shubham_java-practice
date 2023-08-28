package Pattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  A B C D E
//  G H I J	K
//  L M N O P
//  Q R S T U
//  V W X Y Z 		
		
		
		
		 int n=5;
		 char ch='A';
		 for (int i = 1; i <=n; i++) 
		 {
		
			for (int j = 1; j <=n; j++) 
			{
				System.out.print(ch++ + " ");
				
			}
			System.out.println();
		}
	}

}

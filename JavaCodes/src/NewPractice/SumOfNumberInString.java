package NewPractice;

public class SumOfNumberInString {

	public static void main(String[] args) {
		String s="2mb4m6mu";
		int sum=0;
		int tsum=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else
			{
				sum=tsum+sum;
				tsum=0;
			}
			
		
		
		}
		sum=tsum+sum;
		System.out.print(sum);
	}
		

}

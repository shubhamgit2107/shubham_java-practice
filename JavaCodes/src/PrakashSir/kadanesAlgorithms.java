package PrakashSir;

public class kadanesAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {2,3,4,3,4,1,2,3};
int maxsofar= Integer.MIN_VALUE;
int maxendhere=0;
for (int i = 0; i < a.length; i++) {
	maxendhere=maxendhere+a[i];
	if(maxsofar<maxendhere)
	{
		maxsofar=maxendhere;
	}
	if(maxendhere<0)
	{
		maxendhere=0;
	}
	
}
System.out.println(maxsofar);
	}
}

package PrakashSir;
public class MaximumRepeatingValuesinArray {

	public static void main(String[] args)
	{
		
		int[] st= {1,2,3,4,5,5,4,3,2,1,2,2,2};
        int max=0;
        int element=0;
        for (int i = 0; i < st.length; i++)
        {
        	int count=0;
        	for (int j = 0; j < st.length; j++)
        	{
        		if(st[i]==st[j])
        		{
        			count++;
        		}
				if(count>max)
				{
					max=count;
					element=st[i];
				}
			}
			
		}
		System.out.println(element+"is repieating"+max+"maximum times");
		
	}}


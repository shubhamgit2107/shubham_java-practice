package PrakashSir;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
	int[] a= {2,4,5,6,7,8,9,10,13,16};
	int srh=10;
	int li=0;
	int hi=a.length-1;
	int mi=(li+hi)/2;
	
	while(li<=hi)
	{
	if(a[mi]==srh)
	{
		System.out.println("digit is at"+mi+" index position");
		break;
	}
	else if(a[mi]<srh)
	{
		li=mi+1;
	}
	else
	{
		hi=mi-1;
	}
	mi=(li+hi)/2;
	}
	if(li>hi)
	{
		System.out.println("element not found");
	}
}
}
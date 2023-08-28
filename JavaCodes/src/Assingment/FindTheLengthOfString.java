package Assingment;

import java.util.ArrayList;

public class FindTheLengthOfString {

	public static void main(String[] args)
	{
String s="hello";
char[]ch=s.toCharArray();

ArrayList<Character> list=new ArrayList<>();
list.add(ch[0]);
list.add(ch[1]);
list.add(ch[2]);
list.add(ch[3]);
list.add(ch[4]);
int count=0;
for(Character c:list) {
	count++;
}
System.out.println(count);
	}
}

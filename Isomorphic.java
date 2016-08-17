import java.util.HashMap;
import java.util.Scanner;


public class Isomorphic {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string1");
	String s=sc.next();
	System.out.println("enter string2");
	String t=sc.next();
     int i=0;
     HashMap<Character, Character> m=new HashMap<Character, Character>();
	if(s==null||t==null)
	System.out.println("false");
	else if(s.length()!=t.length())
	System.out.println("false");

	
	else if(s.length()==t.length())
	{
	for(i=0;i<s.length();i++)
	{
	 char c1=s.charAt(i);
	 char c2=t.charAt(i);
	
	if(m.containsKey(c1))
	{
    if(m.get(c1)!=c2)
    {
    	System.out.println("false");
    	System.exit(0);
    }
	}
	else
    {
    	if(m.containsValue(c2))
    	{
    		System.out.println("false");
    	    System.exit(0);
    	}
    	m.put(c1,c2);
    }
	
	}}
	System.out.println("true");


}
}

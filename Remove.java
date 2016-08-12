import java.util.Scanner;


public class Remove {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	StringBuffer s=new StringBuffer(sc.next());
	s.reverse();
	System.out.println(s);
	String s1=s.toString();
	s1=s1.replaceAll("[aeiou]","");
	System.out.println(s1);
  }

}
